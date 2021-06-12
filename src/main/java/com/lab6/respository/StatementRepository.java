package com.lab6.respository;

import com.lab6.domain.implementation.Statement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatementRepository extends JpaRepository<Statement, Integer> {
}
