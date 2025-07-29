package com.springboot.santiago.ineterceptor.springboot_interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer{

    @Autowired
    @Qualifier("timeInterceptor")
    private HandlerInterceptor timeInterceptor;
    // This class can be used to configure additional settings for the application,
    // such as interceptors, view resolvers, etc.
    
    // You can implement methods from WebMvcConfigurer to customize the behavior of the application.
    
    // Example: Adding an interceptor
     @Override
     public void addInterceptors(InterceptorRegistry registry) {
         //registry.addInterceptor(timeInterceptor).addPathPatterns("/app/bar", "/app/baz");
         registry.addInterceptor(timeInterceptor).excludePathPatterns("/app/bar", "/app/baz");
     }

}
