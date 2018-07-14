package com.itechsearch.eureka.sampleservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleServiceResource {
    @GetMapping("/getMsg")
    public String getMsg(){
        return "Msg from Sample Service";
    }
}
