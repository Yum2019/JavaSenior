package com.atguigu.exec;

import java.util.Scanner;

/*
输出英文星期几

用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 */
public class WhatDay {
    public static void main(String[] args) {
        String[] weeks = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number > 7 || number < 1){
            System.out.println("输入数字不正确！");
        }else {
            System.out.println(weeks[number-1]);
        }

        scan.close();
    }
}
