package com.example.snowman.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.snowman.entities.InvoiceDB;
import com.example.snowman.entities.ItemDB;
import com.example.snowman.repositories.InvoiceRepository;

import jakarta.transaction.Transactional;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;
    
    @Transactional
    public InvoiceDB save(InvoiceDB invoiceDB) {
        for (ItemDB item : invoiceDB.getItems()) {
            item.setInvoiceDB(invoiceDB);
        }
        return invoiceRepository.save(invoiceDB);
    }
}
