package com.transactionspay.transactionspay.domain.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transactionspay.transactionspay.domain.repositories.UserRepository;
import com.transactionspay.transactionspay.domain.user.UserType;
import com.transactionspay.transactionspay.domain.user.Users;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void validateTransaction(Users sender, BigDecimal amount) throws Exception{
        if (sender.getUserType() == UserType.MERCHANT){
            throw new Exception("Usuário do tipo Lojistas não está autorizado a realizar transações!");

        }
        if(sender.getBalance().compareTo(amount) < 0){
            throw new Exception("Saldo insuficiente!");
        }
    }

    public Users findUserById(Long id) throws Exception{
        return repository.findUserById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    public void saveUser(Users user){
        this.repository.save(user);
    }
}
