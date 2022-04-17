package com.minwailin.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.minwailin.fleetapp.models.VehicleMaintenance;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Integer> {

}
