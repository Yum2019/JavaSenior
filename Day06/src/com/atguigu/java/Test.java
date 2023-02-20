package com.atguigu.java;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符串，并多混入空格回车尝试不同结果");
        if(scan.hasNextLine() ) {
            System.out.println("第一次"+scan.next());
            System.out.println("第二次"+scan.next());
            System.out.println("第三次"+scan.next());
        }
        System.out.println("验证存储寿命是否＝scan对象寿命"+scan.next());
    }
}
