package com.equipo4.cuentaBanco.regClienteOaut2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;


@Configuration
@EnableOAuth2Client
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	                .csrf()
	                    .disable()
	                .antMatcher("/**")
	                .authorizeRequests()
	                .antMatchers("/", "/index.html","/user","/templates/index")
	                    .permitAll()
	                .anyRequest()
	                    .authenticated();
	    }
}