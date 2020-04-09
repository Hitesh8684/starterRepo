package com.demo.form.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.demo.form.UserServiceInterceptor;

public class UserConfig implements WebMvcConfigurer {

	@Autowired
	UserServiceInterceptor userServiceInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(userServiceInterceptor);
	}
	
	
}
