package com.example.snowman.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.snowman.dto.PalletDTO;
import com.example.snowman.entities.PalletDB;
import com.example.snowman.services.PalletService;

@RestController
@RequestMapping("/snowman/pallet")
public class PalletController {

	@Autowired
	private PalletDB palletDB;

	@Autowired
	private PalletService palletDBService;

	@PostMapping("/addPallet")
    public ResponseEntity<String> addPallot(@RequestBody PalletDTO pallet) {
		try {
			
			palletDB.setPalletID(pallet.getPalletID());
			palletDB.setMaxWeight(pallet.getMaxWeight());
		
			palletDBService.save(palletDB);
		
			return ResponseEntity.status(HttpStatus.OK).body("Pallet added successfully");
		}
		catch (DataIntegrityViolationException e) {
	        
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid data provided");
			
	    } 
		catch (Exception e) {
			
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while adding the pallet");
		}
	}
}
