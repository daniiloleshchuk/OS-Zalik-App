package com.lab6.controller.implementation;

import com.lab6.domain.implementation.Statement;
import com.lab6.service.IGeneralService;
import com.lab6.service.implementation.StatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("statement")
public class StatementController extends GeneralController<Statement> {

    @Autowired
    StatementService statementService;

    @Override
    public IGeneralService<Statement> getService() {
        return statementService;
    }
}
