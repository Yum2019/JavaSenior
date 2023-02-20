package com.atguigu.exec;

import org.junit.Test;

import java.util.Scanner;

/*
从键盘读入学生成绩，找出最高分，并输出学生成绩等级。

- 成绩>=最高分-10  等级为’A’
- 成绩>=最高分-20  等级为’B’
- 成绩>=最高分-30  等级为’C’
- 其余            等级为’D’

提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 */
public class StudentAchievement {
    public static void main(String[] args) {
        int[] arr01 = new int[4];
        Scanner scan = new Scanner(System.in);
        int arr = 0;
        for (int i = 0; i < arr01.length; i++) {
            arr01[i] = scan.nextInt();
            if (arr < arr01[i]){
                 arr = arr01[i];
            }
        }

        System.out.println("最高分是：" + arr);

        char grade;
        for (int i = 0; i < arr01.length; i++) {
            if (arr01[i]>=arr-10){
                grade = 'A';
            }else if(arr01[i]>=arr-20){
                grade = 'B';
            }else if (arr01[i]>=arr-30){
                grade = 'C';
            }else {
                grade = 'D';
            }
            System.out.println("成绩：" + arr01[i] + "-评价：" + grade);
        }
    }

    //答案
    @Test
    public void test(){
        //1. 根据提示，获取学生人数
        System.out.print("请输入学生人数：");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        //2. 根据学生人数，创建指定长度的数组 (使用动态初始化)
        int[] scores = new int[count];

        //3. 使用循环，依次给数组的元素赋值
        int maxScore = 0; //记录最高分
        System.out.println("请输入" + count + "个成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
            //4. 获取数组中元素的最大值，即为最高分
            if(maxScore < scores[i]){
                maxScore = scores[i];
            }
        }

        System.out.println("最高分是：" + maxScore);

        //5. 遍历数组元素，输出各自的分数，并根据其分数与最高分的差值，获取各自的等级
        char grade;
        for (int i = 0; i < scores.length; i++) {

            if(scores[i] >= maxScore - 10){
                grade = 'A';
            }else if(scores[i] >= maxScore - 20){
                grade = 'B';
            }else if(scores[i] >= maxScore - 30){
                grade = 'C';
            }else{
                grade = 'D';
            }
            System.out.println("student " + i + " socre is " + scores[i] + ", grade is " + grade);
        }
        //关闭资源
        scanner.close();

    }
}
