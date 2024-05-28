package com.accesadades.botiga.Service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;

import com.accesadades.botiga.Model.Product;
import com.accesadades.botiga.Repository.ProductRepository;

public class ProductServiceImpl implements ProductService
{
    @Autowired
    private ProductRepository product_repository;

    @Override
    public Set<Product> findAllProducts() {return product_repository.findAll();}

    @Override
    public Product findProductsByName(String name) {return product_repository.findByName(name);}

    @Override
    public Set<Product> findAllProducts(String subcategory) {return product_repository.findBySubCategory(subcategory);}

    @Override
    public void deleteById(@NonNull Long id) {product_repository.deleteById(id);}

    @Override
    public Product save(Product entity) {return product_repository.save(entity);}

    @Override
    public void increasePrice(Product product) {product_repository.increasePrice(product);}

}
