package com.accesadades.botiga.Service;

import java.util.Set;

import org.springframework.lang.NonNull;

import com.accesadades.botiga.Model.Product;

public interface ProductService
{
    Set<Product> findAllProducts();

    Product findProductsByName(String name);
    
    Set<Product> findAllProducts(String subcategory);

    void deleteById(@NonNull Long id);

    Product save(Product product);

    void increasePrice(Product product);
}