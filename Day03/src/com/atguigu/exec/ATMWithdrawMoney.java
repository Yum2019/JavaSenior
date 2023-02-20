package com.atguigu.exec;
import java.util.Scanner;

public class ATMWithdrawMoney {
//声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。
   Scanner scan = new Scanner(System.in);
    ATMTest a1 = new ATMTest();
    boolean f = true;
    public void option() {
        while (f) {
            prompt();
            int i = scan.nextInt();
            switch (i) {
                case 1:
                    deposit();
                    break;
                case 2:
                    Withdraw();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    exit();
                    break;
            }
        }
    }


    public  void deposit(){
        System.out.println("===========存款============");
        System.out.print("请输入您要存入的金额：");
        int i = scan.nextInt();
        boolean save = a1.save(i);
        if (save){
            System.out.println("存款成功！！");
        }else {
            System.out.println("存款失败。");
        }
    }

    public void Withdraw(){
        System.out.println("===========存款============");
        System.out.print("请输入您要取出的金额：");

        int i = scan.nextInt();

        boolean b = a1.WithdrawMemory(i);
        if (b) {
            System.out.println("取出成功！！");
        }else {
            System.out.println("取出失败。");
        }
    }
    public void exit(){
        System.out.print("是否退出(Y/N)：");
        boolean f1 = true;
            String s = scan.next();
            char c = s.charAt(0);
        while (f1) {
            if (c == 'Y'){
                f = false;
                f1 = false;
            }
        }
    }

    public void prompt(){
        System.out.println("===========ATM============");
        System.out.println("1.存款");
        System.out.println("2.取款");
        System.out.println("3.显示余额");
        System.out.println("4.退出");
        System.out.print("请选择（1-4）：");
    }

    public static void main(String[] args){
        ATMWithdrawMoney a1 = new ATMWithdrawMoney();
        a1.option();
    }

    public void display(){
        System.out.println("===========余额============");
        int balance = a1.getBalance();
        System.out.println("余额为:" + balance);
    }
}

class ATMTest{
   private int balance = 0;

   //构造器
    public ATMTest(int balance){
        this.balance = balance;
    }
    public ATMTest(){}

    //取出行为：
    public boolean WithdrawMemory(int m1){
        if (m1 <= getBalance() && m1 > 0){
            int m2 = getBalance()-m1;
            setBalance(m2);
            return true;
        }else {
            return false;
        }
    }


    //存入行为：
    public boolean save(int b){
        if (b > 0){
            int b1 = balance+=b;
            setBalance(b1);
            return true;
        }else {
            return false;
        }
    }



    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

class AccessBehavior {

}