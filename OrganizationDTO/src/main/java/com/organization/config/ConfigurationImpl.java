package com.organization.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationImpl {
	
	@Bean
	public ModelMapper obJModelMapper() {
		return new ModelMapper();
	}

}
