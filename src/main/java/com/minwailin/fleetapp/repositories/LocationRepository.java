package com.minwailin.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.minwailin.fleetapp.models.Location;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
