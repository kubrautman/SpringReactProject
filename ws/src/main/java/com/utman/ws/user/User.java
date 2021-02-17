package com.utman.ws.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
 
	@Id
	@GeneratedValue
	private long id;

	private String userName;
	private String displayName;
	private String password;


	@Override
	public String toString() {
		return "User [userName=" + userName + ", displayName=" + displayName + ", password=" + password + "]";
	}
	
}
