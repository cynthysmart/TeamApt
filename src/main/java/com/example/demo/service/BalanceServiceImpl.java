package com.example.demo.service;

import com.example.demo.dao.BalanceRepo;
import com.example.demo.entity.Balance;
import com.example.demo.entity.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class BalanceServiceImpl implements BalanceService {
    private BalanceRepo balanceRepo;

    public BalanceServiceImpl(BalanceRepo balanceRepo) {
        this.balanceRepo = balanceRepo;
    }


    @Override
    @Transactional
    public void save(Balance newBalance) {
        balanceRepo.save(newBalance);
    }

    @Override
    @Transactional
    public Optional<Balance> findAccountBalance(Long id) {
        return balanceRepo.findAccountBalance(id);
    }
}
