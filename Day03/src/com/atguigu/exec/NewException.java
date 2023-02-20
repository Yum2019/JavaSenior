package com.atguigu.exec;

public class NewException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("您的数据输入错误");
    }
}
