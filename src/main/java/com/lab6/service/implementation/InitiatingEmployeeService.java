package com.lab6.service.implementation;

import com.lab6.domain.implementation.InitiatingEmployee;
import com.lab6.respository.InitiatingEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class InitiatingEmployeeService extends GeneralService<InitiatingEmployee> {

    @Autowired
    InitiatingEmployeeRepository initiatingEmployeeRepository;

    @Override
    public JpaRepository<InitiatingEmployee, Integer> getRepository() {
        return initiatingEmployeeRepository;
    }
}
