package com.lab6.controller.implementation;

import com.lab6.domain.implementation.ResponsibleEmployee;
import com.lab6.service.IGeneralService;
import com.lab6.service.implementation.ResponsibleEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("responsible_employee")
public class ResponsibleEmployeeController extends GeneralController<ResponsibleEmployee> {

    @Autowired
    ResponsibleEmployeeService responsibleEmployeeService;

    @Override
    public IGeneralService<ResponsibleEmployee> getService() {
        return responsibleEmployeeService;
    }
}
