package com.accesadades.botiga.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.accesadades.botiga.Model.SubCategory;

public interface SubCategoryService {
    public Set<SubCategory> findAllSubCategories();

    public Optional<SubCategory> findById(Long id);

    public List<SubCategory> findByName(String categoria);

    public SubCategory save(SubCategory subcategoria);

    public void deleteById(Long id);
}
