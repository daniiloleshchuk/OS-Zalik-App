package com.lab6.controller.implementation;


import com.lab6.domain.implementation.WorkingPosition;
import com.lab6.service.IGeneralService;
import com.lab6.service.implementation.WorkingPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("working_position")
public class WorkingPositionController extends GeneralController<WorkingPosition> {

    @Autowired
    WorkingPositionService workingPositionService;

    @Override
    public IGeneralService<WorkingPosition> getService() {
        return workingPositionService;
    }
}
