package com.osloAI.backend.dao;
import org.mindrot.jbcrypt.BCrypt;
import com.osloAI.backend.entities.User;
import com.osloAI.backend.resourcers.TokenGenerator;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;

@Repository
public class UserDAO {
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public UserDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int registerUser(User user) {
		try {
			String sql = "Insert into userChat (Name, password, nick, email) values (?,?,?,?)";
			String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
			return jdbcTemplate.update(sql, 
					
					user.getName(), 
					hashedPassword, 
					user.getNick(), 
					user.getEmail());
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return 0;	
	}

	public List<User> findAll() {
		String sql = "SELECT * FROM userChat";
		try {
			return jdbcTemplate.query(sql, (rs, rowNum) -> {
				User user = new User();
				user.setIDUser(rs.getInt("idUser"));
				user.setName(rs.getString("Name"));
				user.setNick(rs.getString("Nick"));
				user.setEmail(rs.getString("Email"));
				user.setPassword(rs.getString("password"));
				return user;
			});
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}
	
	public String login(String email, String plainPassword) {
	    String sql = "SELECT password FROM userchat WHERE email = ?";
	    try {
	        @SuppressWarnings("deprecation")
			String hashedPassword = jdbcTemplate.queryForObject(sql, new Object[]{email}, String.class);

	        if (BCrypt.checkpw(plainPassword, hashedPassword)) {
	            String token = TokenGenerator.generateToken();

	            String updateSql = "UPDATE userchat SET token = ? WHERE email = ?";
	            jdbcTemplate.update(updateSql, token, email);

	            return token;
	        }
	    } catch (EmptyResultDataAccessException e) {
	        System.out.println("Usuário não encontrado: " + email);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null; 
	}

}
