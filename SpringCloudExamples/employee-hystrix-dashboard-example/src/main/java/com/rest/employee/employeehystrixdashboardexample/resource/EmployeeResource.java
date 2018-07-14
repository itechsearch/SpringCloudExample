package com.rest.employee.employeehystrixdashboardexample.resource;

import com.rest.employee.employeehystrixdashboardexample.model.Employee;
import com.rest.employee.employeehystrixdashboardexample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class EmployeeResource {

    @Autowired
    EmployeeService employeeService;
    @GetMapping("/get")
    public Employee getEmployee(){
        return employeeService.getEmployee();
    }

}
