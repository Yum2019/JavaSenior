package com.atguigu.java;
/*
随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
格式如下：
数字xxx的情况如下：
个位数：
十位数：
百位数：

例如：
数字153的情况如下：
个位数：3
十位数：5
百位数：1
 */

import org.junit.Test;

public class operation {
  @Test
    public void test1(){
      int num = 1534;
      int a = num % 10;
      int ten = num % 100;
      int best = num % 1000;
      int thousand = num % 10000;
      System.out.println("个：" + a + "\n十：" + ten + "\n百：" + best + "\n千：" + thousand);

  }

  //为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
  @Test
  public void test2(){
    int hour = 89;
    int day = (hour / 24);
    int hour1 = hour % 24;
    System.out.println("抗洪：" + day + "天" + hour1 + "小时");
  }

  @Test
  public void test3(){
    System.out.println("5+5="+5+5);

    int i = 1;
    int j = i++ + ++i * i++;  //++在前，先加加后赋值，++在后，先赋值后加加
    System.out.println("j = " + j);

  }

  @Test
  public void test4(){

    int m = 2;
    m = m++; //(1)先取b的值“2”放操作数栈 (2)m再自增,m=3 (3)再把操作数栈中的"2"赋值给m,m=2
    System.out.println(m);
  }

  @Test
  public void test5(){
    int m = 2;
    int n = 3;
    m = m++;
    System.out.println("m=" + m);
    System.out.println("n=" + n);

  }
}
