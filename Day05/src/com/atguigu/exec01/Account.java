package com.atguigu.exec01;

public class Account {
    private int id; //id
    private double balance; //余额
    private double annualinterestRate;  //年利率


    //构造器
    public Account(int id, double balance, double annualinterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualinterestRate = annualinterestRate;
    }

    //取钱
    public boolean withdraw(double amount){
        if (amount < 0 || amount > balance){
            return false;
        }else {
            setBalance(getBalance()-amount);
            return true;
        }
    }
    //存钱
    public boolean deposit(double amount){
        if (amount < 0 ){
            return false;
        }else {
            setBalance(getBalance()+amount);
            return true;
        }
    }

    //取钱
    public void withdraw1(double amount){
        if (amount < 0 || amount > balance){
        }else {
            setBalance(getBalance()-amount);
        }
    }
    //存钱
    public void deposit1(double amount){
        if (amount < 0 ){
        }else {
            setBalance(getBalance()+amount);
        }
    }

    //get/set方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualinterestRate() {
        return annualinterestRate;
    }

    public void setAnnualinterestRate(double annualinterestRate) {
        this.annualinterestRate = annualinterestRate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualinterestRate=" + annualinterestRate +
                '}';
    }
}
