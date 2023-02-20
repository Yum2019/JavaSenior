package com.atguigu.exec;

public class Account {
    private double balance;

    //使用构造器，初始化余额
    public Account(double init_balance) {
        this.balance = init_balance;
    }
    //存钱
    public void deposit(double amt){
        if (amt > 0){
            this.balance += amt;
            System.out.println("成功存入！");
        }else {
            System.out.println("存入失败。。");
        }
    }
    //取钱
    public void withdraw(double amt) {
        if (this.balance < amt){
            System.out.println("取钱失败");
        }else {
            this.balance -= amt;
            System.out.println("成功取出" + amt + "元");
        }
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
