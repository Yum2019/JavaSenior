package com.atguigu.java;

import org.junit.Test;

/*
测试变量的基本使用
    1.变量的理解：内存中的一个存储区域，该区域的数据可以在同一类型范围不断变化
    2.变量的构成包含三个要素：数据类型、变量名、存储的值
    3.Java中变量声明的格式：数据类型 变量名 = 变量值
                            int  age = 12;

    4.Java中的变量按照数据类型来分类：
        基本数据类型（8种）：
            整形：byte \ short \ int \ long
            浮点型：float \ double
            字符型：char
            boolean：boolean

          引用数据类型：
            类（class）
            数组（array）
            接口（interface）

            枚举（enum）
            注解（annotation）
            记录（record）

      5.定义变量时，变量名要遵守标识符命名的规则和规范。

      6.说明
      ① 变量都有其作用域。变量只在作用域内是有效的，除了作用域就失效了。
      ② 子啊同一个作用域内，不能声明两个同名的变量。
      ③ 定义好变量以后，就可以通过变量名的方式对变量进行调用和运算
      ④ 变量值在赋值时，必须满足变量的数据类型，并且在数据类型有效的范围内变化。
 */
public class variableTest {
    public static void main(String[] args) {

        int age = 10;
        System.out.println(age);

        char gender;    //变量的声明
        gender = '男';   //变量的复制
        System.out.println(gender);

        char gender01 = '女';    //变量的声明与初始化
        System.out.println(gender01);
    }
    @Test
    public void test1(){
        String str1 = "Hello";
        char c1 = '男';
        int i1 = 12;
        System.out.println(str1 + (c1 + i1));
    }

    @Test
    public void test2(){
        String str1 = "Hello";
        char c1 = '男';
        int i1 = 12;
        System.out.println(str1 + c1 + i1);
    }
}
