package com.example.snowman.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.snowman.entities.ItemDB;

@Repository
public interface ItemRepository extends JpaRepository<ItemDB, Long> {

	@Query("SELECT i FROM ItemDB i WHERE i.invoiceDB.invoiceNumber = :invoiceNumber AND i.descriptionOfGoods = :descriptionOfGoods")
    ItemDB findByInvoiceNumberAndDescriptionOfGoods(@Param("invoiceNumber") String invoiceNumber, @Param("descriptionOfGoods") String descriptionOfGoods);
}
