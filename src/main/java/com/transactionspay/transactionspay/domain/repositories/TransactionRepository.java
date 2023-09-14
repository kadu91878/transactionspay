package com.transactionspay.transactionspay.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactionspay.transactionspay.domain.transaction.Transactions;

public interface TransactionRepository extends JpaRepository<Transactions, Long> {
    
}
