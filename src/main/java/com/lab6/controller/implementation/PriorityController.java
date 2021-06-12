package com.lab6.controller.implementation;

import com.lab6.domain.implementation.Priority;
import com.lab6.service.IGeneralService;
import com.lab6.service.implementation.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("priority")
public class PriorityController extends GeneralController<Priority> {

    @Autowired
    PriorityService priorityService;

    @Override
    public IGeneralService<Priority> getService() {
        return priorityService;
    }
}
