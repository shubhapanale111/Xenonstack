package com.cdac.CarSelling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.CarSelling.model.Item;
import com.cdac.CarSelling.model.Product;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findByProduct(Product product);
}
