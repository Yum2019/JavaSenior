package com.atguigu.java;

import org.junit.Test;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Scanner;

public class ArraryTest02 {
    public static void main(String[] args) {

        char[] word = {'h','e','l','l','o'};
//        System.out.println(Arrays.toString(word));
        int[] arr01 = {1,2,3,4};
        System.out.println(word);
        for (int i = 0; i < arr01.length; i++) {
            System.out.println(arr01[i]);
        }


    }


    /*
动态初始化
    数组存储的元素的数据类型[] 数组名字 = new 数组存储的元素的数据类型[长度];
    或

    数组存储的数据类型[] 数组名字;
    数组名字 = new 数组存储的数据类型[长度];
*/
    @Test
    public void test1(){
        int[] arr02 = new int[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr02.length; i++) {
            arr02[i] = scan.nextInt();
            System.out.println("填入结果：" + arr02[i]);
        }
        System.out.println("填入完成！");
    }




}
