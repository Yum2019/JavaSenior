package com.atguigu.exec;

public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.addCustomer("李","茗" );

        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().withdraw(200);
        System.out.println("余额还剩：" + bank.getCustomer(0).getAccount().getBalance());
    }

}
