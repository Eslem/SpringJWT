package com.backprop.springjwt;

import com.backprop.springjwt.models.Role;
import com.backprop.springjwt.repositories.RoleRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJwtApplication {

	@Autowired
	RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtApplication.class, args);
	}


	@Bean
	InitializingBean seed(){
		return () -> {
			Role role = new Role();
			role.setRole("ADMIN");
			roleRepository.save(role);
		};
	}

}
