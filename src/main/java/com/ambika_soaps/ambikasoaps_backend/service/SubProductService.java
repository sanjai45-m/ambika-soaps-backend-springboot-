package com.ambika_soaps.ambikasoaps_backend.service;

// SubProductService.java

import com.ambika_soaps.ambikasoaps_backend.Model.SubProduct;
import com.ambika_soaps.ambikasoaps_backend.repository.SubProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubProductService {

    @Autowired
    private SubProductRepository subProductRepository;

    public SubProduct addSubProduct(SubProduct subProduct) {
        return subProductRepository.save(subProduct);
    }

    public SubProduct updateSubProduct(Long id, SubProduct subProductDetails) {
        return subProductRepository.findById(id)
            .map(subProduct -> {
                subProduct.setName(subProductDetails.getName());
                subProduct.setPrice(subProductDetails.getPrice());
                subProduct.setDiscountPrice(subProductDetails.getDiscountPrice());
                subProduct.setImage(subProductDetails.getImage());
                return subProductRepository.save(subProduct);
            }).orElse(null);
    }

    public void deleteSubProduct(Long id) {
        subProductRepository.deleteById(id);
    }
}
