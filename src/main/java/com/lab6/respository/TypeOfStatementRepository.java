package com.lab6.respository;

import com.lab6.domain.implementation.TypeOfStatement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfStatementRepository extends JpaRepository<TypeOfStatement, Integer> {
}
