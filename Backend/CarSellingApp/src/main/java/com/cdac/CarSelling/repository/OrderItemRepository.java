package com.cdac.CarSelling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.CarSelling.model.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
