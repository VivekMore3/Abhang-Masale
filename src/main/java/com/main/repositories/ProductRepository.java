package com.main.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entities.ProductMaster;

@Repository
public interface ProductRepository extends JpaRepository<ProductMaster, Integer> {

}
