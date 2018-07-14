package com.rest.employee.employeehystrixdashboardexample.service;

import com.rest.employee.employeehystrixdashboardexample.model.Company;
import com.rest.employee.employeehystrixdashboardexample.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    SimpleCompanyService simpleCompanyService;
    public Employee getEmployee(){
        Employee employee=new Employee();
        employee.setName("iTechSearch");
        employee.setEmployeeId("0001");
       /* Company company =new Company();
        company.setCompanyId("C1");
        company.setCompanyName("Apple");*/
       Company company= simpleCompanyService.getCompany();
        employee.setCompany(company);
        return employee;
    }
}
