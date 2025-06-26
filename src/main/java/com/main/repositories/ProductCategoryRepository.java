package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entities.ProductCategoryMaster;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategoryMaster, Integer>{

}
