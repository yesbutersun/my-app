package com.yesbuter.demo.vo;

import com.yesbuter.demo.annotation.ParamCheck;

import java.util.Objects;

public class Account {

    @ParamCheck(min = 1, max = 20)
    private Integer id;

    @ParamCheck(min = 1, max = 20)
    private Integer money;

    @ParamCheck(min = 1, max = 20)
    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) &&
                Objects.equals(money, account.money) &&
                Objects.equals(userName, account.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, money, userName);
    }

}
