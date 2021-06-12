package com.lab6.controller.implementation;

import com.lab6.domain.implementation.InitiatingEmployee;
import com.lab6.respository.InitiatingEmployeeRepository;
import com.lab6.service.IGeneralService;
import com.lab6.service.implementation.InitiatingEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("initiating_employee")
public class InitiatingEmployeeController extends GeneralController<InitiatingEmployee> {

    @Autowired
    InitiatingEmployeeService initiatingEmployeeService;

    @Override
    public IGeneralService<InitiatingEmployee> getService() {
        return initiatingEmployeeService;
    }
}
