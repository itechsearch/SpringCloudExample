package com.rest.employee.employeehystrixdashboardexample.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rest.employee.employeehystrixdashboardexample.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SimpleCompanyService {

/*
    @LoadBalanced*/
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "getDefaultVal")
    public Company getCompany(){
        Company company=restTemplate.
                getForObject("http://localhost:9000/rest/api/company/get",
                        Company.class);
        return company;
    }

    public Company getDefaultVal(){
        Company company=new Company();
        company.setFailureMessage("some issue with company service");
        company.setSuccess(false);
        return company;
    }


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
