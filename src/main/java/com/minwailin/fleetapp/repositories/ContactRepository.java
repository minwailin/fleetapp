package com.minwailin.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minwailin.fleetapp.models.Contact;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
