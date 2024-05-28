package com.accesadades.botiga.Repository;

import com.accesadades.botiga.Model.SubCategory;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface SubcategoryRepository extends CrudRepository<SubCategory, Long> 
{
    @NonNull
    @Override
    Set<SubCategory> findAll();

    @NonNull
    List<SubCategory> findByName(String subCategoryName);
}
