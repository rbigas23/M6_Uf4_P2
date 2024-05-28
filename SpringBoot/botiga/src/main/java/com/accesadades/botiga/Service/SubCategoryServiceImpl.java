package com.accesadades.botiga.Service;

import com.accesadades.botiga.Model.SubCategory;
import com.accesadades.botiga.Repository.SubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class SubCategoryServiceImpl implements SubCategoryService
{
    @Autowired
    private SubcategoryRepository subCategoryRepository;

    @Override
    public Set<SubCategory> findAllSubCategories() {return subCategoryRepository.findAll();}

    @Override
    public Optional<SubCategory> findById(Long id) {return subCategoryRepository.findById(id);}

    @Override
    public List<SubCategory> findByName(String subCategoryName) {return subCategoryRepository.findByName(subCategoryName);}

    @Override
    public SubCategory save(SubCategory subCategory) {return subCategoryRepository.save(subCategory);}

    @Override
    public void deleteById(Long id) {subCategoryRepository.deleteById(id);}
}