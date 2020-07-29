package com.test.entity;

import java.math.BigDecimal;


public class MySelfEntity {
    private BigDecimal money;
    private String userName;
    private String passWord;
    private String passWord3;

    public BigDecimal getMoney() {
        return money;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "MySelfEntity{" +
                "money=" + money +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
