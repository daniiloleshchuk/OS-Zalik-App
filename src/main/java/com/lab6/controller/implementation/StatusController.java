package com.lab6.controller.implementation;

import com.lab6.domain.implementation.Status;
import com.lab6.service.IGeneralService;
import com.lab6.service.implementation.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("status")
public class StatusController extends GeneralController<Status> {

    @Autowired
    StatusService statusService;

    @Override
    public IGeneralService<Status> getService() {
        return statusService;
    }
}
