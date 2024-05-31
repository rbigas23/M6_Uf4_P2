package com.accesadades.botiga.Controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.accesadades.botiga.Model.Product;
import com.accesadades.botiga.Model.SubCategory;
import com.accesadades.botiga.Service.ProductService;
import com.accesadades.botiga.Service.SubCategoryService;

@Controller
public class WebController {

    @Autowired
    private ProductService productService;

    @Autowired
    private SubCategoryService subCategoryService;

    // Endnpoint d'índex
    @RequestMapping(value = "/")
    public String index(Model model) {
        return "index";
    }

    // Aquest endpoint mostra tots els productes de la base de dades
    @RequestMapping(value = "/catalog")
    public String catalog(Model model) {
        Set<Product> products = productService.findAllProducts();
        model.addAttribute("products", products);
        return "catalog";
    }

    // Aquest endpoint busca un producte pel seu nom i mostra els seus atributs per pantalla
    @RequestMapping(value = { "/search", "/prodname" }, method = { RequestMethod.GET, RequestMethod.POST })
    public String searchProductByName(@RequestParam(value = "name", required = false) String name, Model model) {
        if (name != null) {
            Product product = productService.findProductsByName(name);
            model.addAttribute("product", product);
        }

        // Referencia al template search.html
        return "search";
    }

    /* Aquest endpoint s'encarrega de mostrar el formulari de creació de producte i
    recollir les dades que insereix l'usuari */
    @RequestMapping(value = "/newProduct", method = RequestMethod.GET)
    public String showProductCreationForm(Model model) {

        // Obtenim la llista de subcategories i la pasem com a atribut
        Set<SubCategory> subCategories = subCategoryService.findAllSubCategories();
        model.addAttribute("subCategories", subCategories);

        // Creem un Product buit i el passem com a atribut
        model.addAttribute("product", new Product());

        // Referencia al template productcreation.html
        return "productcreation";
    }

    /* Aquest endpoint s'encarrega de mostrar el producte i portar a l'usuari a la
    pàgina de confirmació */
    @RequestMapping(value = "/desar", method = { RequestMethod.POST })
    public String saveProduct(@ModelAttribute("product") Product product, Model model) {
        if (product == null) {
            return "index";
        }

        // Guardem el producte
        productService.saveProduct(product);

        // Referencia al template productcreationsuccess.html
        return "productcreationsuccess";
    }
}
