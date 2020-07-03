package com.springboot.microservice.authenticate.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.microservice.authenticate.model.LoginDetails;
import com.springboot.microservice.authenticate.repository.LoginRepository;
import com.springboot.microservice.authenticate.repository.RoleRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	@Autowired
	private LoginRepository loginRepository;
	@Autowired
	private RoleRepository roleRepository;

	@Transactional
	@Override
	public CustomUserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		LoginDetails login = loginRepository.findLoginDetailsByUserId(userId);
		if(null == login){
			throw new UsernameNotFoundException("No user present with username: "+userId);
		}else{
			CustomUserDetails customUserDetails = new CustomUserDetails();
			customUserDetails.setLoginDetails(login);
			customUserDetails.setAuth(getAuthority(login));
			return customUserDetails;
			
		}
	}



	private Collection<? extends GrantedAuthority> getAuthority(LoginDetails login) {
		List<SimpleGrantedAuthority> authList = new ArrayList<SimpleGrantedAuthority>();
		authList.add(new SimpleGrantedAuthority(roleRepository.findRoleDetailsByRoleId(login.getRoleId().getRoleId()).getRoleName()));
		return authList;
	}
		
}
