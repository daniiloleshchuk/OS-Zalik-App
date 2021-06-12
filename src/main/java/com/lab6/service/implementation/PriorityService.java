package com.lab6.service.implementation;

import com.lab6.domain.implementation.Priority;
import com.lab6.respository.PriorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PriorityService extends GeneralService<Priority> {

    @Autowired
    PriorityRepository priorityRepository;

    @Override
    public JpaRepository<Priority, Integer> getRepository() {
        return priorityRepository;
    }
}
