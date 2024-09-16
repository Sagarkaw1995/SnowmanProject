package com.example.snowman.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.snowman.entities.InvoiceDB;
import com.example.snowman.entities.PalletDB;

@Configuration
public class AppConfig {
    @Bean
    public InvoiceDB invoiceDB() {
        return new InvoiceDB();
    }
    
    @Bean
    public PalletDB palletDB() {
        return new PalletDB();
    }
    
}