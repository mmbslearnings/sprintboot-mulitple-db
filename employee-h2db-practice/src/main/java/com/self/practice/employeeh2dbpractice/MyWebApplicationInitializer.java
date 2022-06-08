package com.self.practice.employeeh2dbpractice;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.WebApplicationInitializer;

@Component
public class MyWebApplicationInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		servletContext.setInitParameter(
		          "spring.profiles.active", "dev");
	}
}
