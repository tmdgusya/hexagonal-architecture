package com.roach.hexagonalarchitecture.account.port;

import com.roach.hexagonalarchitecture.account.domain.AccountPersistencePort;
import com.roach.hexagonalarchitecture.account.domain.Money;
import com.roach.hexagonalarchitecture.account.persistence.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountPersistencePortImpl implements AccountPersistencePort {

    @Override
    public Account convertToEntity(com.roach.hexagonalarchitecture.account.domain.Account domain) {
        Money money = domain.getMoney();
        Account account = new Account(money.getMoney());
        return account;
    }
}
