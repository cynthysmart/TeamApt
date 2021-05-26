package com.example.demo.dao;

import com.example.demo.entity.Balance;
import com.example.demo.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BalanceRepo extends JpaRepository<Balance, Long> {
    public static final String FIND_ACCOUNT = "SELECT account,  FROM balance";

    @Query(value = FIND_ACCOUNT, nativeQuery = true)
    Optional<Balance> findAccountBalance(Long id);
}
