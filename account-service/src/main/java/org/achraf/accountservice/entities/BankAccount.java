package org.achraf.accountservice.entities;

import jakarta.persistence.*;
import org.achraf.accountservice.enums.AccountType;
import org.achraf.accountservice.model.Customer;

import java.time.LocalDate;
@Entity
public class BankAccount {
    @Id
    private String accountId;
    private double balance;
    private LocalDate createdAt;
    private String Currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Transient
    private Customer customer;
    private Long customerId;


}
