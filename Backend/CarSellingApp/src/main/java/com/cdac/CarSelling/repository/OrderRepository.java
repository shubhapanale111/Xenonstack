package com.cdac.CarSelling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.CarSelling.model.Order;
import com.cdac.CarSelling.model.User;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByUser(User user);
}
