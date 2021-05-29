package com.lab6.controller.implementation;

import com.lab6.domain.implementation.Employee;
import com.lab6.service.IGeneralService;
import com.lab6.service.implementation.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController extends GeneralController<Employee> {

    @Autowired
    EmployeeService employeeService;

    @Override
    public IGeneralService<Employee> getService() {
        return employeeService;
    }
}
