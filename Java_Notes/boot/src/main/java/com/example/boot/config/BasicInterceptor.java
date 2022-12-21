package com.example.boot.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
//Interceptors are used to pre/post-process info before regular handlers (inside controller classes) do their work. This can be useful for logging info before/after
//an http request is handled, or could be used to validate a session before allowing the request to be sent to its proper handler in the API.

//WARNING: If an ExceptionHandler is triggered, no postHandle method will be triggered
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component  //tells Spring to manage the class
public class BasicInterceptor implements HandlerInterceptor{
    //preHandle will execute BEFORE any method is called
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("BasicInterceptor preHandle executed.");
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("BasicInterceptor postHandle executed.");
    }
}
