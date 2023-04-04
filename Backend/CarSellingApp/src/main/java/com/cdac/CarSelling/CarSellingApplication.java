package com.cdac.CarSelling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.cdac.CarSelling.model.Role;
import com.cdac.CarSelling.model.Roles;
import com.cdac.CarSelling.repository.RolesRepository;

@SpringBootApplication
public class CarSellingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarSellingApplication.class, args);
	}

	private final RolesRepository rolesRepository;

	public CarSellingApplication(RolesRepository rolesRepository) {
		this.rolesRepository = rolesRepository;
	}


	@EventListener(ApplicationReadyEvent.class)
	public void initializeRoles() {
		if(rolesRepository.findByRoleName(Role.USER)==null)
			rolesRepository.save(new Roles(Role.USER));
		if(rolesRepository.findByRoleName(Role.OWNER)==null)
			rolesRepository.save(new Roles(Role.OWNER));

	}

}
