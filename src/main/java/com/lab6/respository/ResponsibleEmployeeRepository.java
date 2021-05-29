package com.lab6.respository;

import com.lab6.domain.implementation.ResponsibleEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsibleEmployeeRepository extends JpaRepository<ResponsibleEmployee, Integer> {
}
