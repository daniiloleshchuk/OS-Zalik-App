package com.lab6.controller.implementation;

import com.lab6.domain.implementation.EquipmentLocation;
import com.lab6.service.IGeneralService;
import com.lab6.service.implementation.EquipmentLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("equipment_location")
public class EquipmentLocationController extends GeneralController<EquipmentLocation> {

    @Autowired
    EquipmentLocationService equipmentLocationService;

    @Override
    public IGeneralService<EquipmentLocation> getService() {
        return equipmentLocationService;
    }
}
