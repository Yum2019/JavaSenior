package com.atguigu.java;

import javax.jws.soap.SOAPBinding;

/*
测试标识符的使用（必须遵守，否则不通过！！）
    1.声明是标识符？Java中变量、方法、类等要所命名时使用的字符序列，称为标识符
    技巧：“凡是自己可以起名字的地方都叫标识符"。比如：类名、方法名

    2.标识符的命名规则
    > 由26个英文字母的大小写，0-9、_或$组成
    > 数字不可以开头
    > 不可以使用关键字和保留字，但能包含关键字和保留字
    > Java中严格区分大小写，长度无限制
    > 标识符不能包含空格

    3.标识符的命名规范
    > 包名：多单词组成时所有字母都小写：xxxyyyzzz。
    例如：java.lang、com.atguigu.bean

    > 类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz        //大驼峰
      例如：HelloWorld，String，System等

    > 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz  //小驼峰
      例如：age,name,bookName,main,binarySearch,getName

    > 常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ
      例如：MAX_VALUE,PI,DEFAULT_CAPACITY

    起名要：见名知意思！！

 */
public class IdentifierTest {
    public static void main(String[] args) {
        int abc = 12;
        int age = 12;   //age：标识符

        char gender = '男';  //标识符gender一看就知道是指性别的意思
        char c = '女';       // c  一看也不知道是指性别

        //变量名规范如下：
        int myAge = 12;
        System.out.println("年龄：" + myAge);


    }
}

//例子：
class _a$b_9{

}
//体现了严格区分大小写
class Public{

}

//类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
class PublicClassTest{

}



