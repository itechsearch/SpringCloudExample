package com.itechsearch.configServer.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/rest")
public class TestResource {

    @Value("${customConfigProp: default value}")
    private String customConfigProp;

    @GetMapping("/getPropVal")
    public String getCustomConfigProp(){
        return customConfigProp;
    }
}
