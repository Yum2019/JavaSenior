package com.atguigu.java1;

import java.util.Scanner;

public class Betgame {
    public static void main(String[] args) {
        int i1 = (int) (Math.random() * 6 + 1);
        int i2 = (int) (Math.random() * 6 + 1);
        int i3 = (int) (Math.random() * 6 + 1);

        System.out.println("请押宝（豹子、大、小）");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();

        boolean result = false;

        switch (s){
            case "豹子":
                result = i1 == i2 && i2 == i3;
                break;
            case "大":
                result = i1 + i2 + i3 > 9;
                break;
            case "小":
                result = i1 + i1 + i3 <= 9;
                break;
            default:
                System.out.println("输入有误！");
        }
        System.out.println("a/b/c分别是" + i1 + "," + i2 + "," + i3);
        System.out.println(result ? "猜中了" : "猜错了");
    }
}
