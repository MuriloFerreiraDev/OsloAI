package com.osloAI.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.osloAI.backend.dao.UserDAO;
import com.osloAI.backend.entities.User;

@SpringBootApplication
public class OsloAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsloAiApplication.class, args);
		UserDAO userDAO = null;
		User user = null;
		user.setName("Lucas");
		user.setEmail("uasjhdvbadushj");
		user.setNick("Vosso");
		user.setPassword("asdbjhdas");
		
		userDAO.registerUser(user);
		
		
	}


}
