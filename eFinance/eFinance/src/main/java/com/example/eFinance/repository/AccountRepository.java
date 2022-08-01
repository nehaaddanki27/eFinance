package com.example.eFinance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eFinance.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>
{

}
