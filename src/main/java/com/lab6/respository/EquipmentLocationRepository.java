package com.lab6.respository;

import com.lab6.domain.implementation.EquipmentLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentLocationRepository extends JpaRepository<EquipmentLocation, Integer> {
}
