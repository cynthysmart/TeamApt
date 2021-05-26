package com.example.demo.service;

import com.example.demo.dao.BalanceRepo;
import com.example.demo.dao.TransactionRepo;
import com.example.demo.entity.Transaction;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class TransactionServiceImpl implements TransactionService {
    private TransactionRepo transactionRepo;

    public TransactionServiceImpl(TransactionRepo transactionRepo) {
        this.transactionRepo = transactionRepo;
    }

    @Override
    @Transactional
    public List<Transaction> findAll() {
        return null;
    }

    @Override
    @Transactional
    public Optional<Transaction> findById(Long theId) {
        return Optional.empty();
    }

    @Override
    @Transactional
    public void save(Transaction transaction) {

    }

    @Override
    public void deleteById(Long theId) {

    }
}
