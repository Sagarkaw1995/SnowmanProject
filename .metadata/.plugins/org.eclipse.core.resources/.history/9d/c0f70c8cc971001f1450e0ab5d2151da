package com.example.snowman.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.snowman.dto.GoodReceiptNote;
import com.example.snowman.entities.ItemDB;
import com.example.snowman.repositories.CartonRepository;
import com.example.snowman.repositories.ItemRepository;

@Service
public class GoodReceiptNoteService {

	@Autowired
	private CartonRepository cartonRepository;

	@Autowired
	private ItemRepository itemRepository;

	public List<GoodReceiptNote> generateGoodReceiptNotes(String invoiceNumber) {
        List<GoodReceiptNote> receiptNotes = new ArrayList<>();
        
        try {
	        List<Object[]> cartonCounts = cartonRepository.findCartonCountsByInvoiceNumber(invoiceNumber);
	        
	        for (Object[] result : cartonCounts) {
	            String description = (String) result[0];
	            int actualQuantity = ((Long) result[1]).intValue();
	            
	            ItemDB item = itemRepository.findByInvoiceNumberAndDescriptionOfGoods(invoiceNumber, description);
	            int invoicedQuantity = item != null ? item.getQuantityInCase() : 0;
	            String netQuantity = actualQuantity > invoicedQuantity  ? "greater" : actualQuantity < invoicedQuantity ? "less" : "equal";
	            
	            GoodReceiptNote note = new GoodReceiptNote();
	            note.setInvoiceNumber(invoiceNumber);
	            note.setDescriptionOfGoods(description);
	            note.setInvoicedQuantity(invoicedQuantity);
	            note.setActualQuantity(actualQuantity);
	            note.setNetQuantity(netQuantity);
	            
	            receiptNotes.add(note);
	        }
        }
        catch(Exception e) {
        	System.out.println("Error generating good receipt notes: " + e.getMessage());
        }
        
        return receiptNotes;
    }

}
