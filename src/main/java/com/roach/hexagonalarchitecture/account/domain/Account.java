package com.roach.hexagonalarchitecture.account.domain;

public class Account {

    private Long id;
    private Money money;

    public Account() {
        this.money = new Money(0);
    }

    public Money withdraw(Money money) {
        this.money.minus(money);
        return money;
    }

    public void deposit(Money money) {
        this.money.plus(money);
    }

    public Money getMoney() {
        return money;
    }

}
