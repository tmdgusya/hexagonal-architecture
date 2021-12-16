package com.roach.hexagonalarchitecture.account.domain;

public class Money {

    private int money;

    public Money(int money) {
        if (money < 0) {
            throw new IllegalArgumentException("0 이하의 돈은 존재하지 않습니다.");
        }
        this.money = money;
    }

    public void plus(Money money) {
        this.money += money.getMoney();
    }

    public void minus(Money money) {
        this.money -= money.getMoney();
    }

    public int getMoney() {
        return money;
    }
}
