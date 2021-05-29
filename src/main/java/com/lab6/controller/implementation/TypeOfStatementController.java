package com.lab6.controller.implementation;

import com.lab6.domain.implementation.TypeOfStatement;
import com.lab6.service.IGeneralService;
import com.lab6.service.implementation.TypeOfStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("type_of_statement")
public class TypeOfStatementController extends GeneralController<TypeOfStatement> {

    @Autowired
    TypeOfStatementService typeOfStatementService;

    @Override
    public IGeneralService<TypeOfStatement> getService() {
        return typeOfStatementService;
    }
}
