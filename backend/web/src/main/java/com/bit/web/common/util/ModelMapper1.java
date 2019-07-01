package com.bit.web.common.util;

import org.modelmapper.ModelMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ModelMapper
 */
@Configuration
public class ModelMapper1 {

    @Bean
    public ModelMapper modelMapper(){
		ModelMapper modelMapper = new ModelMapper ();
		return modelMapper;
	} 
}