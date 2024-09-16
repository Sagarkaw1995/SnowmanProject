package com.example.snowman.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.snowman.entities.InvoiceDB;

@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceDB, String>{

}
