package com.atguigu.java1;

import org.junit.Test;

import java.util.Scanner;

public class IfElseTest {
    @Test
    public void test1(){
        //输入三个数字，用if——else排序
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入你的num1：");
        int num1 = scan.nextInt();
        System.out.print("请输入你的num2：");
        int num2 = scan.nextInt();
        System.out.print("请输入你的num3：");
        int num3 = scan.nextInt();

        if(num1 >= num2){

            if(num3 >= num1)
                System.out.println(num2 + "-" + num1 + "-" + num3);
            else if(num3 <= num2)
                System.out.println(num3 + "-" + num2 + "-" + num1);
            else
                System.out.println(num2 + "-" + num3 + "-" + num1);
        }else{ //num1 < num2

            if(num3 >= num2){
                System.out.println(num1 + "-" + num2 + "-" + num3);
            }else if(num3 <= num1){
                System.out.println(num3 + "-" + num1 + "-" + num2);
            }else{
                System.out.println(num1 + "-" + num3 + "-" + num2);
            }
        }
    }
}


