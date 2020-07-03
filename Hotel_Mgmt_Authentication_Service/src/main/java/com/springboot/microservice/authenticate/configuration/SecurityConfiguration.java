package com.springboot.microservice.authenticate.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springboot.microservice.authenticate.service.CustomUserDetailsService;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	@Bean
	public UserDetailsService customUserDetailService() {
		return new CustomUserDetailsService();
	}

	@Bean
	public  BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
		auth.setUserDetailsService(customUserDetailService());
		auth.setPasswordEncoder(passwordEncoder());
		return auth;
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) {
		auth.authenticationProvider(authenticationProvider());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/login").hasAnyRole("ADMIN","CLERK","CUSTOMER").and().authorizeRequests()
		.antMatchers("/login","/resource/**").permitAll().and().formLogin().loginPage("/login")
		.usernameParameter("userId").passwordParameter("password").permitAll().loginProcessingUrl("/doLogin")
		.successForwardUrl("/postLogin").failureUrl("/loginFailed").and().logout().logoutUrl("/doLogout")
		.logoutSuccessUrl("/logout").permitAll().and().csrf().disable();
		
	}
}
