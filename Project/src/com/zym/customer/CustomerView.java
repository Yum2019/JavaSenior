package com.zym.customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CustomerView {
    static Scanner scan = new Scanner(System.in);
    CustomerList c1 = new CustomerList(20);
    /*
    按照设计要求编写CustomerList类，并编译
    在CustomerList类中临时添加一个main方法中，作为单元测试方法。
    在方法中创建CustomerList对象（最多存放5个客户对象），然后分别用模拟数据调用以下各个方法，以测试各方法是否编写正确：
     */
    boolean flage = true;
    public void enterMainMenu() throws IOException {
        do {
            System.out
                    .println("\n-------------------拼电商客户管理系统-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");
            char c = CustomerUtil.readChar();
            switch (c){
                case '1':
                    addNewCustomer();
                    EnterNext();
                    break;
                case '2':
                    modifyCustomer();
                    EnterNext();
                    break;
                case '3':
                    deleteCustomer();
                    EnterNext();
                    break;
                case '4':
                    listAllCustomers();
                    EnterNext();
                    break;
                case '5':
                    exitCustomer();
                    break;
            }
        }while (flage);
    }

    private void exitCustomer() throws IOException {
        System.out.print("是否要退出Customer（Y/N）:");
        char c = CustomerUtil.readConfirmSelection();
        if (c == 'Y'){
            flage = false;
        }else EnterNext();

    }

    private void EnterNext() throws IOException {
        System.out.println("按回车继续");
        new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    private void addNewCustomer(){
        boolean judgment = true;
        while (judgment) {
            System.out.println("---------------------添加客户---------------------");
            System.out.print("姓名：");
            String name = CustomerUtil.readString(3);
            System.out.print("性别：");
            char gender = CustomerUtil.readChar();
            System.out.print("年龄：");
            int age = CustomerUtil.readInt();
            System.out.print("电话号码：");
            String phone = CustomerUtil.readString(13);
            System.out.print("电子邮箱：");
            String email = CustomerUtil.readString(20);
            //将输入的信息，传入数组中。
            Customer cust = new Customer(name, gender, age, phone, email);
            boolean b = c1.addCustomer(cust);
            if (b) {
                System.out.println("创建用户成功！！");
                judgment = false;
            }else{
                System.out.print("创建失败，是否重新创建（Y/N）：" );
                char c = CustomerUtil.readConfirmSelection();
                if (c == 'Y'){
                    continue;
                }else {
                    break;
                }

            }
        }
    }
    private void modifyCustomer(){
        System.out.println("-------------------------修 改 客 户-------------------------");
        System.out.print("请输入你要修改客户的编号id：");
        int i = scan.nextInt();
        Customer customer = c1.getCustomer(i-1);
        System.out.print("姓名：");
        String name = CustomerUtil.readString(3,customer.getName());
        System.out.print("性别：");
        char gender = CustomerUtil.readChar(customer.getGender());
        System.out.print("年龄：");
        int age = CustomerUtil.readInt(customer.getAge());
        System.out.print("电话号码：");
        String phone = CustomerUtil.readString(13,customer.getPhone());
        System.out.print("电子邮箱：");
        String email = CustomerUtil.readString(20,customer.getEmail());

        Customer cust = new Customer(name, gender, age, phone, email);

        boolean b = c1.replaceCustomer(i-1, cust);
        if (b) {
            System.out.println("修改成功！！");
        }else {
            System.out.println("修改失败。。");
        }
    }

    private void deleteCustomer(){
        System.out.println("-------------------------删 除 客 户-------------------------");
        System.out.print("请输入你要删除客户的编号id：");
        int i = scan.nextInt();

        boolean b = c1.deleteCustomer(i - 1);
        if (b) {
            System.out.println("删除成功！！");
        }else {
            System.out.println("删除失败。。");
        }

    }

    private void listAllCustomers(){
        System.out.println("-------------------------客户列表完成-------------------------");
        System.out.println("姓名\t\t" + "性别\t\t" + "年龄\t\t" + "电话\t\t" + "邮箱");
        Customer[] allCustomer = c1.getAllCustomer();
        for (int i = 0; i < allCustomer.length; i++) {
            System.out.println(allCustomer[i].getName() + "\t\t" + allCustomer[i].getGender() + "\t\t" +
                    allCustomer[i].getAge() + "\t\t" + allCustomer[i].getPhone() + "\t\t" + allCustomer[i].getEmail());
        }
    }


    public static void main(String[] args) throws IOException {
        CustomerView v1 = new CustomerView();
        v1.enterMainMenu();
    }

}
