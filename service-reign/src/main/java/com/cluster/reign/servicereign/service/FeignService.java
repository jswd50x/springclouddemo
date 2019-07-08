package com.cluster.reign.servicereign.service;

import com.cluster.reign.servicereign.service.impl.SchedualServiceHiStric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sun.misc.Request;

@FeignClient(value = "service-hi",fallback = SchedualServiceHiStric.class)
public interface FeignService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value="name") String name);
}
