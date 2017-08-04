package com.jboadao.segurocotxe.business;

import com.jboadao.segurocotxe.model.Brand;
import com.jboadao.segurocotxe.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class to perform the business logic related to brands. Validations, etc.
 */
@Service
public class BrandBusinessLogic {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandBusinessLogic(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public void saveBrand(Brand brand) {
        brandRepository.save(brand);
    }

    public Iterable<Brand> findAll() {
        return brandRepository.findAll();
    }
}
