package com.osloAI.backend;
import com.osloAI.backend.dao.UserDAO;
import com.osloAI.backend.entities.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserDAOTest {
	
    @Autowired
    private UserDAO userDAO;
    
    @Test
    public void registerTest() {
    	User user = new User();
    	user.setName("Dianna");
    	user.setNick("Linda");
    	user.setEmail("dianna@gmail.com");
    	user.setPassword("Dianna41");
    	
    	int result = userDAO.registerUser(user);
    	assertEquals(1,result);
    }
    
    @Test
    public void findAllTest() {
    	List<User> userList = userDAO.findAll();
    	assertTrue(userList.size()>0);
    	userList.forEach(System.out::println);
    	
    }
    @Test
    public void loginTest() {
    	String result = userDAO.login("dianna@gmail.com", "Dianna31");
    	assertNotNull(result);
    }
	
}
