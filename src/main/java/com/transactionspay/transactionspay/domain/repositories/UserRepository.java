package com.transactionspay.transactionspay.domain.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactionspay.transactionspay.domain.user.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

    Optional <Users> findUserByCpf(String cpf);
    
    Optional <Users> findUserById(Long id);
}
