package com.lab6.service.implementation;

import com.lab6.domain.implementation.EquipmentLocation;
import com.lab6.respository.EquipmentLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EquipmentLocationService extends GeneralService<EquipmentLocation> {

    @Autowired
    EquipmentLocationRepository equipmentLocationRepository;

    @Override
    public JpaRepository<EquipmentLocation, Integer> getRepository() {
        return equipmentLocationRepository;
    }
}
