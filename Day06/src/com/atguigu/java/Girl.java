package com.atguigu.java;

import com.sun.corba.se.impl.orbutil.ORBUtility;

public class Girl {
    private String name;
    private int age;

    public Girl() {}

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给" + boy.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
