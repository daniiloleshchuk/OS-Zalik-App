package com.lab6.service.implementation;

import com.lab6.domain.implementation.Employee;
import com.lab6.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends GeneralService<Employee> {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public JpaRepository<Employee, Integer> getRepository() {
        return employeeRepository;
    }

}
