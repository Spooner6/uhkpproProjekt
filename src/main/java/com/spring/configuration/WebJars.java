package com.spring.configuration;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class WebJars extends WebMvcConfigurerAdapter {

    public void addResourceHandler(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/webbjars/**").addResourceLocations("/webjars/");
    }
}
