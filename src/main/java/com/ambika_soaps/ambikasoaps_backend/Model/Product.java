package com.ambika_soaps.ambikasoaps_backend.Model;
import lombok.Data;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @Lob
    private byte[] image;  // Store image as byte array

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<SubProduct> subproducts;
}
