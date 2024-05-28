package com.accesadades.botiga.Repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import com.accesadades.botiga.Model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> 
{
    @Override
    @NonNull
    Set<Product> findAll();
    Product findByName(String name);
    Set<Product> findByNameAndPrice(String name, float price);
}