package com.lab6.service.implementation;

import com.lab6.domain.implementation.Statement;
import com.lab6.respository.StatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class StatementService extends GeneralService<Statement> {

    @Autowired
    StatementRepository statementRepository;

    @Override
    public JpaRepository<Statement, Integer> getRepository() {
        return statementRepository;
    }
}
