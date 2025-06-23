package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entities.CartMaster;

@Repository
public interface CartRepository extends JpaRepository<CartMaster, Integer> {

}
