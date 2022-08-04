package com.example.eFinance.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.eFinance.model.Account;

public interface AccountService
{
    List<Account> getAllAccounts();

    void saveAccount(Account account);

    Account getAccountById(long id);

    void deleteAccountById(long id);

    Page<Account> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
