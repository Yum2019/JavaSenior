package com.heima.exec;

import java.util.Scanner;

public class AirTicketTest {
    /* 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、
    月份和头等舱或经济舱。按照如下规则计算机票价格:旺季 (5-10月)头等舱9折，
    经济舱8.5折，淡季(11月到来年4月)头等舱7折，经济舱6.5折。
     */
    public static void main(String[] args) {

        //从键盘录入     头等舱 0 经济舱 1
        //旺季（5-10月）：  9折     8.5折
        //淡季（11-4月）：  7折     6.5折
        Scanner scanner = new Scanner(System.in);
        //1.机票原价
        System.out.print("请输入机票的原价格：");
        int price = scanner.nextInt();
        //输入月份
        System.out.print("请输入当前的月份：");
        int day = scanner.nextInt();
        //选择 经济舱还是头等舱
        System.out.print("请输入你选择的机舱（头等舱 0 经济舱 1）");
        int i = scanner.nextInt();

        int operation = operation(day, i, price);
        System.out.println("折扣后的价格为：" + operation);


    }
    //写一个做判断，进行打折的方法
    public static int operation(int day, int i, int price){
        if (day >= 5 && day <= 10) {
            if (i == 0) {
                return (int) (price * 0.9);
            } else {
                return (int) (price * 0.85);
            }
        }
        if ((day >= 1 && day <= 4) || (day == 11)){
            if (i == 0) {
                return (int) (price * 0.7);
            } else {
                return (int) (price * 0.65);
            }
        }
        return price;
    }

}