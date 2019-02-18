package com.ghost.domainobject.security.impl;

import com.ghost.domainobject.security.IAuthorities;

public class Authorities implements IAuthorities {
	
	private String username;
	private String authority;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
