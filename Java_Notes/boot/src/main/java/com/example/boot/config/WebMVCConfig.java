package com.example.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//@Configuration tells Spring to change the default behavior of the Spring Boot implementation, in this case by implementing WebMvcConfigurer the custom made 
//HandlerInterceptor is added to the Spring Web module, allowing Spring to know whether to execute the pre/posthandle methods as defined in custom interceptors.
@Configuration
public class WebMVCConfig implements WebMvcConfigurer{  //Spring Web is the new name for Spring MVC
    @Autowired
    private BasicInterceptor basicInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //addInterceptors tells Spring to keep track of the basicInterceptor that is created at runtime
        //addPathPatterns tells Spring what http url patterns should be intercepted by the interceptor
        registry.addInterceptor(basicInterceptor).addPathPatterns("/**");
    }
    
}
