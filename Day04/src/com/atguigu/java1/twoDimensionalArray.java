package com.atguigu.java1;

public class twoDimensionalArray {
    public static void main(String[] args) {
        //推荐声明法
//        int[][] grades;
//        String[][] name;
        
        //存储多组成绩
        int[][] grades = {
                {89,75,99,100},
                {88,96,78,63,100,86},
                {56,63,58},
                {99,66,77,88}
        };

        //存储多组姓名
        String[][] names = {
                {"张三","李四", "王五", "赵六"},
                {"刘备","关羽","张飞","诸葛亮","赵云","马超"},
                {"曹丕","曹植","曹冲"},
                {"孙权","周瑜","鲁肃","黄盖"}
        };
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                System.out.println(grades[i][j]+"," + names[i][j]);
            }
        }
    }
        
    
}
