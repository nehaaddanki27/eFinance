package com.example.eFinance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.eFinance.model.Account;
import com.example.eFinance.repository.AccountRepository;

@Service
public class AccountServiceDispatch implements AccountService
{
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Account getAccountById(long id)
    {
        Optional<Account> optional = accountRepository.findById(id);
        Account account = null;
        if (optional.isPresent())
        {
            account = optional.get();
        }
        else
        {
            throw new RuntimeException(" Account not found for id :: " + id);
        }
        return account;
    }

    @Override
    public void deleteAccountById(long id) {
        this.accountRepository.deleteById(id);
    }

    @Override
    public Page<Account> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.accountRepository.findAll(pageable);
    }
}
