package com.atguigu.java1;


public class FindACommonMultiple {
//求最大公倍数：
    public static void main(String[] args) {
        int n = 20;
        int m = 30;
        int min = (n > m) ? n : m;
        for (int i = min; i >= 1; i--) {
            if (n % i == 0 && m % i ==0){
                System.out.println("两者的最大公倍数是:" + i);
                break;
            }
        }

        //求最小公倍数
        //取两个数的最大值
        int max = (m > n) ? m : n;
        for (int i = max; i < n * m; i++) {
            if (i % n == 0 && i % m == 0){
                System.out.println("最大公倍数是:" + i);
                break;
            }
        }
    }
}
