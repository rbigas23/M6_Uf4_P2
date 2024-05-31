package com.accesadades.botiga.Repository;

import com.accesadades.botiga.Model.SubCategory;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

// Repositori de l'entitat SubCategory
// Només implementem els mètodes necessaris per a que el servei funcioni correctament
@Repository
public interface SubcategoryRepository extends CrudRepository<SubCategory, Long> 
{
    @NonNull
    @Override
    Set<SubCategory> findAll();

    @NonNull
    Optional<SubCategory> findByName(String subCategoryName);
}
