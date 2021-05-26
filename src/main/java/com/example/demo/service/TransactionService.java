package com.example.demo.service;

import com.example.demo.entity.Transaction;

import java.util.List;
import java.util.Optional;

public interface TransactionService {
    List<Transaction> findAll();
    Optional<Transaction> findById(Long theId);
    void save(Transaction transaction);
    void deleteById(Long theId);
}

