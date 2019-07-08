package com.cluster.demo.clienthi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hi,i am "+name+", i am from port:"+port;
    }

    @RequestMapping(value = "/give", method = RequestMethod.GET)
    public String give(@RequestParam String name) {
        return name;
    }

}
