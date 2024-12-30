package com.ambika_soaps.ambikasoaps_backend.Model;

// SubProduct.java

import jakarta.persistence.*;


import lombok.Data;


@Entity
@Data
public class SubProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private double discountPrice;

    @Lob
    private byte[] image;  // Store image as byte array

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
