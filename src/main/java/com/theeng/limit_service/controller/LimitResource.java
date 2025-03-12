package com.theeng.limit_service.controller;

import com.theeng.limit_service.configuration.Configuration;
import com.theeng.limit_service.dto.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitResource {

    @Autowired
    private Configuration configuration;

    @GetMapping("/getLimit")
    public Limit getlimit() {
        return new Limit(configuration.getMin(),configuration.getMax());
    }
}
