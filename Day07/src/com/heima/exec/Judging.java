package com.heima.exec;

import java.util.Scanner;

/*
评委打分
 */
public class Judging {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //1.定义一个数组，用来存储6茗评委的打分（0 ~ 100）
        int[] scores = getScores();
        //2.求出数组的最大值
        int scoresMax = getScoresMax(scores);
        //3.求数组的最小值
        int scoresMin = getScoresMin(scores);
        //4.求总分
        int sum = getSum(scores);
        //5.去掉最大值和最小值，求出其他四个值的平均值
        int ave = (sum - scoresMax - scoresMin)/(scores.length - 2);
        System.out.println("平均分为：" + ave);

    }

    private static int getSum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }


    public static int getScoresMax(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getScoresMin(int[] scores){
        int min = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > min){
                min = scores[i];
            }
        }
        return min;
    }

    public static int[] getScores(){
        int[] arr1 = new int[6];
        for (int i = 0; i < arr1.length;) {
            System.out.println("请评委打分");
            int i1 = scanner.nextInt();
            if (i1 <= 100 && i1 >= 0){
                arr1[i] = i1;
                i++;
            }else {
                System.out.println("（超出范围）请重新打分。");
            }
        }
            return arr1;
    }
}
