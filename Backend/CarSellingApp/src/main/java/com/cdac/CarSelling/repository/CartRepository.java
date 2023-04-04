package com.cdac.CarSelling.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cdac.CarSelling.model.Cart;
import com.cdac.CarSelling.model.User;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Cart findByUser(User user);
}
