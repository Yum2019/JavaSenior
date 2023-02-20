package com.atguigu.exec02;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr3 = new int[]{-99,-54,-2,0,2,33,43,256,999};
        boolean isFlag = true;
        int head = 0;
        int value = 256;
        int end = arr3.length-1;
        while (head <= end){
            int middle = (head + end) / 2;
            if (arr3[middle] == value){
                System.out.println("找到指定的元素，索引为：" + middle);
                isFlag = false;
                break;
            }else if(arr3[middle] > value){
                end = middle - 1;
            }else{
                head = middle + 1;
            }
        }

        if (isFlag){
            System.out.println("未找打指定的元素");
        }
    }
}
