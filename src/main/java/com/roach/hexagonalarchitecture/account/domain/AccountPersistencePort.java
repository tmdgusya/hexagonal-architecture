package com.roach.hexagonalarchitecture.account.domain;

import com.roach.hexagonalarchitecture.account.persistence.Account;

public interface AccountPersistencePort {

    public Account convertToEntity(com.roach.hexagonalarchitecture.account.domain.Account domain);

}
