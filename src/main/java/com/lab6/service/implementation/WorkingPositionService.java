package com.lab6.service.implementation;

import com.lab6.domain.implementation.WorkingPosition;
import com.lab6.respository.WorkingPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkingPositionService extends GeneralService<WorkingPosition> {

    @Autowired
    WorkingPositionRepository workingPositionRepository;

    @Override
    public JpaRepository<WorkingPosition, Integer> getRepository() {
        return workingPositionRepository;
    }
}
