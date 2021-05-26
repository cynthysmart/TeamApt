package com.example.demo.service;

import com.example.demo.entity.Balance;
import com.example.demo.entity.Transaction;

import java.util.List;
import java.util.Optional;

public interface BalanceService {

    void save(Balance newBalance);

    Optional<Balance> findAccountBalance(Long id);
}
