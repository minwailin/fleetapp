package com.minwailin.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.minwailin.fleetapp.models.Invoice;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
