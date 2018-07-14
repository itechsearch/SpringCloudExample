package com.itechsearch.eureka.sampleclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleClientResource {

    @Autowired
    SampleServiceClient sampleServiceClient;
    @GetMapping("/getData")
    public String getData(){
        return sampleServiceClient.getMsg();
    }
}
