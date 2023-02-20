package com.atguigu.java;

public class WhileTest {
    public static void main(String[] args) {
    //遍历1-100的偶数，并计算所有偶数的和、偶数的个数（累加的思想）
        int i = 1;  //声明并初始化循环条件
        int sum = 0;//记录1-100所有的偶数的和
        int count = 0; //记录有多个偶数

        while (i <= 100){
            if (i % 2 == 0){
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println("偶数的个数有：" + count);
        System.out.println("100以内的偶数相加结果为:" + sum);
    }
}

