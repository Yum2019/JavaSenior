package com.atguigu.java;

public class MarryTest {
    public static void main(String[] args) {
        Boy boy = new Boy("李文",26);
        boy.marry(new Girl("小文",25));

        Girl girl = new Girl("小梅",23);
        girl.marry(boy);
    }
}
