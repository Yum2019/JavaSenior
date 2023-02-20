package com.atguigu.exec01;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        Account account = new Account(1001,2000,1.23);

        customer.setAccounts(account);

        customer.getAccounts().withdraw1(1010);
        customer.getAccounts().deposit1(2000);
        System.out.println(customer.toString());


    }
}
