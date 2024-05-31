package com.accesadades.botiga.Service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.accesadades.botiga.Model.Product;
import com.accesadades.botiga.Model.SubCategory;
import com.accesadades.botiga.Repository.ProductRepository;

// Implementació de la interfície de servei de Product
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Set<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product findProductsByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public Set<Product> findProductsBySubCategory(SubCategory subcategory) {
        return productRepository.findBySubCategory(subcategory);
    }

    @Override
    public void deleteProductById(@NonNull Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product saveProduct(Product entity) {
        return productRepository.save(entity);
    }

    @Override
    public void increaseProductPrice(Product product, float amount) {
        productRepository.increasePrice(product.getProductId(), amount);
    }

}
