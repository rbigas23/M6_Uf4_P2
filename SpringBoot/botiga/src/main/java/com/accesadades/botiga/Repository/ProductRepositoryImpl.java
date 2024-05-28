package com.accesadades.botiga.Repository;

import org.springframework.lang.NonNull;

import java.util.Set;
import com.accesadades.botiga.Model.Product;

public class ProductRepositoryImpl implements ProductRepository
{
    @Override
    @NonNull
    Set<Product> findAll()
    {

    }

    @Override
    @NonNull
    Product findByName(String name)
    {

    }

    @Override
    @NonNull
    Set<Product> findByNameAndPrice(String name, float price)
    {

    }
}