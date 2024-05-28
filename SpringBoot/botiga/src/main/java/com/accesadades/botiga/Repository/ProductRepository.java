package com.accesadades.botiga.Repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import com.accesadades.botiga.Model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> 
{
    @NonNull
    @Override
    Set<Product> findAll();

    @NonNull
    Set<Product> findBySubCategory(String sub_category);

    @NonNull
    Product findByName(@NonNull String name);

    @Override
    void deleteById(@NonNull Long id);

    @Override
    @NonNull
    <S extends Product> S save(@NonNull S entity);

    void increasePrice(Product product_to_increase_price_of);
}