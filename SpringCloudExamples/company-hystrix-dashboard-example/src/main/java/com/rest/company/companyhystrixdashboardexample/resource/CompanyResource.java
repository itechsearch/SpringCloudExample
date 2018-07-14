package com.rest.company.companyhystrixdashboardexample.resource;

import com.rest.company.companyhystrixdashboardexample.model.Company;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/company")
public class CompanyResource {



    @GetMapping("/get")
    public Company getCompany(){
        Company company=new Company();
        company.setCompanyId("C1");
        company.setCompanyName("Apple");
        return company;
    }
}
