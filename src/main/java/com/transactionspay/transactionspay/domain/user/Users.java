package com.transactionspay.transactionspay.domain.user;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "users")
@Table(name = "users")
@Data
@EqualsAndHashCode(of = "id")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String cpf;
    @Column(unique = true)
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserType userType;
    private BigDecimal balance;
    
}
