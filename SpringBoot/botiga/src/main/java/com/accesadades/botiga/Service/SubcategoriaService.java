package com.accesadades.botiga.Service;

import com.accesadades.botiga.Model.SubCategory;
import com.accesadades.botiga.Repository.SubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SubcategoriaService {

    @Autowired
    private SubcategoryRepository subcategoriaRepository;

    public List<SubCategory> findAll() {
        return subcategoriaRepository.findAll();
    }

    public Optional<SubCategory> findById(Long id) {
        return subcategoriaRepository.findById(id);
    }

    public SubCategory save(SubCategory subcategoria) {
        return subcategoriaRepository.save(subcategoria);
    }

    public void deleteById(Long id) {
        subcategoriaRepository.deleteById(id);
    }

    // Métodos de búsqueda personalizados
    public List<SubCategory> findByNombreContaining(String nombre) {
        return subcategoriaRepository.findByNombreContaining(nombre);
    }

    public List<SubCategory> findByCategoria(String categoria) {
        return subcategoriaRepository.findByCategoria(categoria);
    }
}