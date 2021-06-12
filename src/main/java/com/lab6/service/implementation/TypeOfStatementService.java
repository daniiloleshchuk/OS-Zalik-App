package com.lab6.service.implementation;

import com.lab6.domain.implementation.TypeOfStatement;
import com.lab6.respository.TypeOfStatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TypeOfStatementService extends GeneralService<TypeOfStatement> {

    @Autowired
    TypeOfStatementRepository typeOfStatementRepository;

    @Override
    public JpaRepository<TypeOfStatement, Integer> getRepository() {
        return typeOfStatementRepository;
    }
}
