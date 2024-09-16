package com.example.snowman.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.snowman.entities.GoodReceiptNoteDB;

@Repository
public interface GoodReceiptNoteRepository extends JpaRepository<GoodReceiptNoteDB, Long>{
	List<GoodReceiptNoteDB> findByInvoiceNumber(String invoiceNumber);
}
