package com.atguigu.java1;

public class DoWhileTest {
    public static void main(String[] args) {
    //遍历1-100的偶数，并计算所有偶数的和、偶数的个数（累加的思想）
        int i = 1;
        int sum = 0;
        int count = 0;
        do {
            if (i % 2 == 0){
                sum += i;
                i++;
                count++;
            }
            i++ ;
        }while (i <= 100);
        System.out.println("偶数的总和为：" + sum);
        System.out.println("偶数的个数为：" + count);
    }

}
