package com.transactionspay.transactionspay.domain.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.transactionspay.transactionspay.domain.user.Users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "transactions")
@Table(name = "transactions")
@Data
@EqualsAndHashCode(of = "id")
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    @ManyToOne
    @JoinColumn(name="sender_id")
    private Users sender;
    @ManyToOne
    @JoinColumn(name="receiver_id")
    private Users receiver;
    private LocalDateTime timestamp;

    
}
