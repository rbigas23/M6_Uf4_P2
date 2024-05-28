package com.accesadades.botiga.Model;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subcategory")
public class SubCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    /*@ManyToOne
    @JoinColumn(name = "categoria_id")
    private Category categoria;

    @OneToMany(mappedBy = "subCategory", cascade = CascadeType.ALL)
    private List<Product> productos;*/
}