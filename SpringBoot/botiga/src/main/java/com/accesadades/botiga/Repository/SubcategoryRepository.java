package com.accesadades.botiga.Repository;

import com.accesadades.botiga.Model.SubCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubcategoryRepository extends CrudRepository<SubCategory, Long> {
    List<Subcategoria> findByNombreContaining(String nombre);
    List<Subcategoria> findByCategoria(String categoria);
}
