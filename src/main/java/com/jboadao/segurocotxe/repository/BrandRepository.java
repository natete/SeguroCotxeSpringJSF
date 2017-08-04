package com.jboadao.segurocotxe.repository;

import com.jboadao.segurocotxe.model.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Long> {
}
