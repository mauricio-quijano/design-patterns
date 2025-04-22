package com.example.patterns_banking.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AccountType {
    SAVINGS("Savings accounts are designed for accumulating money for future use"),
    CHECKING("Checking accounts are for everyday transactions, like paying bills");

    private final String description;
}
