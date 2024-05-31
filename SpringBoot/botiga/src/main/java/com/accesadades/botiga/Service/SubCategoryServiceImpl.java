package com.accesadades.botiga.Service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accesadades.botiga.Model.SubCategory;
import com.accesadades.botiga.Repository.SubcategoryRepository;

// Implementació de la interfície de servei de SubCategory
@Service
public class SubCategoryServiceImpl implements SubCategoryService {
    @Autowired
    private SubcategoryRepository subCategoryRepository;

    @Override
    public Set<SubCategory> findAllSubCategories() {
        return subCategoryRepository.findAll();
    }

    @Override
    public Optional<SubCategory> findSubcategoryById(Long subcategoryId) {
        return subCategoryRepository.findById(subcategoryId);
    }

    @Override
    public Optional<SubCategory> findSubcategoryByName(String subCategoryName) {
        return subCategoryRepository.findByName(subCategoryName);
    }

    @Override
    public SubCategory saveSubcategory(SubCategory subCategory) {
        subCategoryRepository.save(subCategory);
        return subCategory;
    }

    @Override
    public void deleteSubcategoryById(Long subcategoryId) {
        subCategoryRepository.deleteById(subcategoryId);
    }
}