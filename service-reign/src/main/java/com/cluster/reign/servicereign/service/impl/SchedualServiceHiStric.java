package com.cluster.reign.servicereign.service.impl;

import com.cluster.reign.servicereign.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiStric implements FeignService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" +name;
    }
}
