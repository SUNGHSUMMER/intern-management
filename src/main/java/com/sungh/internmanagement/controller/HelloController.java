package com.sungh.internmanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping
    public String hello(){
        return "Hello Intern";
    }

    @RequestMapping("/info")
    public Map<String, String> SimpleInfo(){
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Sun Guohao");
        map.put("Email", "1225418211@qq.com");
        return map;
    }
}
