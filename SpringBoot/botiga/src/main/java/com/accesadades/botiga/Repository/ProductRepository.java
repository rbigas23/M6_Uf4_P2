package com.accesadades.botiga.Repository;

import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import com.accesadades.botiga.Model.Product;
import com.accesadades.botiga.Model.SubCategory;

import jakarta.transaction.Transactional;

// Repositori de l'entitat Product
// Només implementem els mètodes necessaris per a que el servei funcioni correctament
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    @NonNull
    @Override
    Set<Product> findAll();

    @NonNull
    Product findByName(@NonNull String productName);

    @NonNull
    Set<Product> findBySubCategory(SubCategory subCategory);
    
    @Modifying
    @Transactional
    @Query("UPDATE Product p SET p.price = p.price + :amount WHERE p.id = :productId")
    void increasePrice(long productId, float amount);
}