package com.osloAI.backend.entities;


public class User {
	@Override
	public String toString() {
		return "User [name=" + name + ", nick=" + nick + ", email=" + email + ", ID=" + IDUser + "]";
	}

	private String name;
	private String password;
	private String newPassword;
	private String newNick;
	private String nick;
	private String email;
	private String token;
	private Integer IDUser;

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getNewNick() {
		return newNick;
	}

	public void setNewNick(String newNick) {
		this.newNick = newNick;
	}

	public Integer getIDUser() {
		return IDUser;
	}

	public void setIDUser(Integer iDUser) {
		IDUser = iDUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
