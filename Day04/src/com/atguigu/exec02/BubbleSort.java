package com.atguigu.exec02;

import jdk.nashorn.internal.ir.Flags;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
    /*
思考：冒泡排序是否可以优化
*/
        int[] arr = {1, 3, 5, 7, 9};

//        //从小到大排序
//        for (int i = 0; i < arr.length - 1; i++) {
//            boolean flag = true;//假设数组已经是有序的
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                //希望的是arr[j] < arr[j+1]
//                if (arr[j] > arr[j + 1]) {
//                    //交换arr[j]与arr[j+1]
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//
//                    flag = false;//如果元素发生了交换，那么说明数组还没有排好序
//                }
//            }
//            if (flag) {
//                break;
//            }
//        }
        Arrays.sort(arr);

        //完成排序，遍历结果
        int i1 = Arrays.binarySearch(arr, 3);
        System.out.println(i1);
    }

}
