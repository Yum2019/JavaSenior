package com.atguigu.java1;

public class daffodils {
    //水仙花
    public static void main(String[] args) {
        int count = 0;

        for (int i = 100; i < 1000; i++) {
            int  a = i % 10;
            int ten = i / 10 % 10;
            int best = i / 100;
            if ((a*a*a+ten*ten*ten+best*best*best)==i){
                System.out.println("水仙花数：" + i);
                count++;
            }
        }
        System.out.println("水仙花数共有"+count+"个");
    }
}
