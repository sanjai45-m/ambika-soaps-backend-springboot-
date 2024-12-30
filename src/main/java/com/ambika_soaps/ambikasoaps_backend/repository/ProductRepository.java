package com.ambika_soaps.ambikasoaps_backend.repository;

// ProductRepository.java

import org.springframework.data.jpa.repository.JpaRepository;

import com.ambika_soaps.ambikasoaps_backend.Model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
}

