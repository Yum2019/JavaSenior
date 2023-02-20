package com.atguigu.exec;

public class Bank {
    private Customer[] customer = new Customer[10];
    private int numberOfCustomer;   //客户量

    public Bank() {}
    //添加客户
    public void addCustomer(String f,String l){
        Customer cust = new Customer(f,l);
        customer[numberOfCustomer++] = cust;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= numberOfCustomer){
            return null;
        }

        return customer[index];
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "customer=" + customer +
                ", numberOfCustomer=" + numberOfCustomer +
                '}';
    }
}
