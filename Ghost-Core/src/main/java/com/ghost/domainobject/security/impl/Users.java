package com.ghost.domainobject.security.impl;

import com.ghost.domainobject.security.IUsers;

/**
 * 
 * @author root
 * Spring Security Table
 *
 */
public class Users implements IUsers {
	
	private String username;
	private String password;
	private boolean enable;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}

}
