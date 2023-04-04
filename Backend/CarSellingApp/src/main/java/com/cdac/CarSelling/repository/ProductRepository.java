package com.cdac.CarSelling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.CarSelling.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
