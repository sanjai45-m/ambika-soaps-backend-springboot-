package com.ambika_soaps.ambikasoaps_backend.controller;

// SubProductController.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ambika_soaps.ambikasoaps_backend.Model.SubProduct;
import com.ambika_soaps.ambikasoaps_backend.service.SubProductService;

@RestController
@RequestMapping("/api/subproducts")
public class SubProductController {

    @Autowired
    private SubProductService subProductService;

    @PostMapping
    public SubProduct addSubProduct(@RequestBody SubProduct subProduct) {
        return subProductService.addSubProduct(subProduct);
    }

    @PutMapping("/{id}")
    public SubProduct updateSubProduct(@PathVariable Long id, @RequestBody SubProduct subProductDetails) {
        return subProductService.updateSubProduct(id, subProductDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteSubProduct(@PathVariable Long id) {
        subProductService.deleteSubProduct(id);
    }
}
