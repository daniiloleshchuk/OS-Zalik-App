package com.lab6.respository;

import com.lab6.domain.implementation.InitiatingEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InitiatingEmployeeRepository extends JpaRepository<InitiatingEmployee, Integer> {
}
