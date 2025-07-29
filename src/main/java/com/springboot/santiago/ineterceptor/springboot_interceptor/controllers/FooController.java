package com.springboot.santiago.ineterceptor.springboot_interceptor.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class FooController {

    @RequestMapping("/foo")
    public Map<String,String> foo() {
        return Collections.singletonMap("message", "Hello foooo FooController!");
    }

    @RequestMapping("/bar")
    public Map<String,String> bar() {
        return Collections.singletonMap("message", "Hello bar FooController!");
    }
    
    @RequestMapping("/baz")
    public Map<String,String> baz() {
        return Collections.singletonMap("message", "Hello baz FooController!");
    }
    // Additional methods can be added here as needed
}
