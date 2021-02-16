package com.utman.ws.user;

import lombok.Data;

@Data
public class User {


	private String userName;
	private String displayName;
	private String password;


	@Override
	public String toString() {
		return "User [userName=" + userName + ", displayName=" + displayName + ", password=" + password + "]";
	}
	
}
