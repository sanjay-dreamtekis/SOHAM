package com.dreamtech.soham20.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
public class CrosOrgin implements WebFluxConfigurer {
	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	            .allowedOrigins("http://192.168.29.169:3000") 
	            .allowedMethods("GET", "POST", "PUT", "DELETE")
	            .allowedHeaders("*")
	            .allowCredentials(true)
	            .maxAge(3600);
	    }
}
