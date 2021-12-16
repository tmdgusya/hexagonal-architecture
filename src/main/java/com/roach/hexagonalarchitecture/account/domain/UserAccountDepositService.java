package com.roach.hexagonalarchitecture.account.domain;

import com.roach.hexagonalarchitecture.account.persistence.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class UserAccountDepositService {

    private final AccountPersistencePort accountPersistencePort;
    private final AccountRepository accountRepository;

    public UserAccountDepositService(AccountPersistencePort accountPersistencePort, AccountRepository accountRepository) {
        this.accountPersistencePort = accountPersistencePort;
        this.accountRepository = accountRepository;
    }

    public void deposit(int money) {
        Account account = new Account();
        Money depositMoney = new Money(money);

        account.deposit(depositMoney);

        com.roach.hexagonalarchitecture.account.persistence.Account entity = accountPersistencePort.convertToEntity(account);
        accountRepository.save(entity);
    }

}
