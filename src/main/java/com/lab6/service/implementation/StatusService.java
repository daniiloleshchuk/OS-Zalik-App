package com.lab6.service.implementation;

import com.lab6.domain.implementation.Status;
import com.lab6.respository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class StatusService extends GeneralService<Status> {

    @Autowired
    StatusRepository statusRepository;

    @Override
    public JpaRepository<Status, Integer> getRepository() {
        return statusRepository;
    }
}
