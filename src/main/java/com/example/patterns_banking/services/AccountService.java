package com.example.patterns_banking.services;

import com.example.patterns_banking.dtos.AccountDTO;
import com.example.patterns_banking.models.Account;
import com.example.patterns_banking.models.AccountType;
import com.example.patterns_banking.repositories.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private AccountRepository accountRepository;

    public AccountService() {
        this.accountRepository = AccountRepository.getInstance();
    }

    public Account create(AccountDTO accountDTO) {
        Account account = Account
                .builder()
                .number(accountDTO.getNumber())
                .type(AccountType.valueOf(accountDTO.getType()))
                .balance(accountDTO.getBalance())
                .isActive(accountDTO.getIsActive())
                .build();

        return accountRepository.save(account);
    }
}
