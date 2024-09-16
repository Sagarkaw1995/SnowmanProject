package com.example.snowman.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.snowman.entities.PalletDB;
import com.example.snowman.repositories.PalletRepository;

import jakarta.transaction.Transactional;

@Service
public class PalletService {
	
	@Autowired
	private PalletRepository palletRepository;
	
    @Transactional
    public PalletDB save(PalletDB palletDB) {
        return palletRepository.save(palletDB);
    }
}
