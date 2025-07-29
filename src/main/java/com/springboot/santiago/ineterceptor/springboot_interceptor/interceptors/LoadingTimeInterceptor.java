package com.springboot.santiago.ineterceptor.springboot_interceptor.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import io.micrometer.common.lang.Nullable;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("timeInterceptor")
public class LoadingTimeInterceptor  implements  HandlerInterceptor{
    
    private static final Logger logger = LoggerFactory.getLogger(LoadingTimeInterceptor.class);
    // This class can be used to implement methods for intercepting requests
    // and measuring loading times, such as preHandle, postHandle, and afterCompletion.
    
    // Example method to log loading time

    // Additional methods can be implemented as needed
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
    @Nullable ModelAndView modelAndView) throws Exception {
          HandlerMethod controller = ((HandlerMethod) handler);
        long startTime = (Long) request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
        long loadingTime = endTime - startTime;
        System.out.println("Loading time: " + loadingTime + " ms"); 
        logger.info("Loading time: {} ms", loadingTime+" postHandle() saliendo....."+ controller.getMethod().getName() );
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        HandlerMethod controller = ((HandlerMethod) handler);
        request.setAttribute("startTime", startTime);
        logger.info("preHandle() entrando....."+controller.getMethod().getName());
        // You can add additional logic here if needed
        return true;
    }


}
