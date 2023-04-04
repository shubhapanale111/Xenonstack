package com.cdac.CarSelling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.CarSelling.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
