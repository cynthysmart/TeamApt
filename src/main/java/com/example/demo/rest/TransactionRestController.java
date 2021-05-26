package com.example.demo.rest;

import com.example.demo.entity.Balance;
import com.example.demo.entity.Transaction;
import com.example.demo.service.BalanceService;
import com.example.demo.service.TransactionService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TransactionRestController {
    private TransactionService transactionService;
    private BalanceService balanceService;

    public TransactionRestController(TransactionService transactionService, BalanceService balanceService) {
        this.transactionService = transactionService;
        this.balanceService = balanceService;
    }

    @PostMapping("/transaction")
    public Transaction saveTransaction(@Validated @RequestBody Transaction transaction){
        transaction.setReference(0);
        transactionService.save(transaction);
        return transaction;
    }
    @GetMapping("/transaction")
    public Optional<Balance> getBalanceFromDb(long number){
        Optional<Balance> balance = balanceService.findAccountBalance(number);
        if (balance == null){
            throw new RuntimeException("Balance id not found -" +number);
        }
        return balance;
    }
}
