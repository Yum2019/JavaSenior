package com.atguigu.java;

import org.junit.Test;

public class ArraryMemory {
    @Test
    public void test1(){
        System.out.println("------Int------");
        int[] arr01 = new int[10];
        System.out.println(arr01[0]);
        System.out.println(arr01[1]);
        System.out.println("------String------");
        String[] arr02 = new String[3];
        System.out.println(arr02[0]);
        System.out.println(arr02[1]);
        System.out.println("------Double------");
        double[] arr03 = new double[3];
        System.out.println(arr03[0]);
        System.out.println(arr03[1]);
    }
}
