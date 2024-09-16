package com.example.snowman.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.snowman.entities.CartonDB;
import com.example.snowman.entities.InvoiceDB;
import com.example.snowman.entities.PalletDB;
import com.example.snowman.repositories.CartonRepository;
import com.example.snowman.repositories.InvoiceRepository;
import com.example.snowman.repositories.PalletRepository;

@Service
public class CartonService {
	
    @Autowired
    private CartonRepository cartonRepository;

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private PalletRepository palletDBRepository;

    public void saveCarton(CartonDB cartonDB) {
        cartonRepository.save(cartonDB);
    }

    public InvoiceDB findInvoiceByNumber(String invoiceNumber) {
        return invoiceRepository.findById(invoiceNumber).orElse(null);
    }

    public PalletDB findPalletById(String palletID) {
        return palletDBRepository.findById(palletID).orElse(null);
    }
}

