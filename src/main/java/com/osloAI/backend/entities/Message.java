package com.osloAI.backend.entities;

import java.time.LocalDateTime;

public class Message {

	private int idUser;
	private String message;
	private LocalDateTime time;
	private int idMessage;
	private int idGroup;
	private int idDestiny;
	private String status;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getIdUser() {
		return idUser;
	}

	public int getIdMessage() {
		return idMessage;
	}

	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdGroup() {
		return idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	public int getIdDestiny() {
		return idDestiny;
	}

	public void setIdDestiny(int idDestiny) {
		this.idDestiny = idDestiny;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Message idUser=" + idUser + " message=" + message + "\t time=" + time + " status=" + status+"\n" ;
	}
	
	

}
