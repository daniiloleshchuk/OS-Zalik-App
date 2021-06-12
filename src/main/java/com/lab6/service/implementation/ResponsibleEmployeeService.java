package com.lab6.service.implementation;

import com.lab6.domain.implementation.ResponsibleEmployee;
import com.lab6.respository.ResponsibleEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ResponsibleEmployeeService extends GeneralService<ResponsibleEmployee> {

    @Autowired
    ResponsibleEmployeeRepository responsibleEmployeeRepository;

    @Override
    public JpaRepository<ResponsibleEmployee, Integer> getRepository() {
        return responsibleEmployeeRepository;
    }
}
