package com.accesadades.botiga.Service;

import java.util.Set;

import org.springframework.lang.NonNull;

import com.accesadades.botiga.Model.Product;
import com.accesadades.botiga.Model.SubCategory;

// Definició de la interfície per al servei de Product
public interface ProductService {
    Set<Product> findAllProducts();

    Product findProductsByName(String name);

    Set<Product> findProductsBySubCategory(SubCategory subcategory);

    Product saveProduct(Product product);

    void deleteProductById(@NonNull Long id);

    void increaseProductPrice(Product product, float amount);
}