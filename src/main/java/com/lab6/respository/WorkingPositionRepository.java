package com.lab6.respository;

import com.lab6.domain.implementation.WorkingPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingPositionRepository extends JpaRepository<WorkingPosition, Integer> {
}
