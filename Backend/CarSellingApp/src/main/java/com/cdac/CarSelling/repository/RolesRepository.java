package com.cdac.CarSelling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.CarSelling.model.Role;
import com.cdac.CarSelling.model.Roles;

public interface RolesRepository extends JpaRepository<Roles, Long> {
    Roles findByRoleName(Role role);
}
