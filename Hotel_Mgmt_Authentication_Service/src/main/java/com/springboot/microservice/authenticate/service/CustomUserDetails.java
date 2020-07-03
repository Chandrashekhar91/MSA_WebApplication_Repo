package com.springboot.microservice.authenticate.service;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.springboot.microservice.authenticate.model.LoginDetails;

public class CustomUserDetails implements UserDetails {	
	
	private static final long serialVersionUID = 1L;
	private LoginDetails loginDetails;
	private Collection<? extends GrantedAuthority> auth = null;
	
	public Collection<? extends GrantedAuthority> getAuth() {
		return auth;
	}

	public void setAuth(Collection<? extends GrantedAuthority> auth) {
		this.auth = auth;
	}

	public LoginDetails getLoginDetails() {
		return loginDetails;
	}

	public void setLoginDetails(LoginDetails loginDetails) {
		this.loginDetails = loginDetails;
	}

	

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}


	@Override
	public String getUsername() {
		return loginDetails.getUserName();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return auth;
	}

	@Override
	public String getPassword() {
		return new BCryptPasswordEncoder().encode(loginDetails.getPassword());
	}


}
