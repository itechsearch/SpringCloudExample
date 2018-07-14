package com.itechsearch.eureka.sampleclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("sample-service")
public interface SampleServiceClient {

    @RequestMapping("/getMsg")
    public String getMsg();
}
