package com.accesadades.botiga.Service;

import java.util.Optional;
import java.util.Set;

import com.accesadades.botiga.Model.SubCategory;

// Definició de la interfície per al servei de SucCategory
public interface SubCategoryService {
    public Set<SubCategory> findAllSubCategories();

    public Optional<SubCategory> findSubcategoryById(Long subcategoryId);

    public Optional<SubCategory> findSubcategoryByName(String subcategoryName);

    public SubCategory saveSubcategory(SubCategory subcategoria);

    public void deleteSubcategoryById(Long subcategoryId);
}
