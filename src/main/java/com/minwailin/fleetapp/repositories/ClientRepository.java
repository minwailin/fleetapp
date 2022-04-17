package com.minwailin.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.minwailin.fleetapp.models.Client;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
