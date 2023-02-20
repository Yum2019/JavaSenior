package com.atguigu.java;

import java.util.Scanner;

public class GuessSize {
    public static void main(String[] args) {
        //产生一个随机数
        int random = (int) (Math.random() * 100 ) + 1;
       //作弊：查看random的数字
//        System.out.println("产生的随机数是:" + random);

        //从键盘录入一个数字
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        //累计到猜对位置的次数
        int count = 0;

        while (guess != random){
            //判断是是猜大了还是猜小了
            if (guess > random){
                System.out.println("猜大了");
            }
            if (guess < random){
                System.out.println("猜小了");
            }
            //不对，再猜。
            System.out.println("请输入一个（1-100）范围的数字");
            guess = scan.nextInt();
            count++;
        }
        System.out.println("恭喜你，猜中了。");
        System.out.println("你一共猜了：" + count + "次");
    }
}
