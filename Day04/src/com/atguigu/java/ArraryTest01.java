package com.atguigu.java;

public class ArraryTest01 {
    public static void main(String[] args) {
        //1.1、推荐
        //元素的数据类型[] 一维数组的名称;
        //比如，要存储一组编号
        int[] arr;
        //比如，要存储一组价格
        double[] arr1;
        //比如，要存储一组姓名
        String[] arr2;  //引用类型变量数组
        //比如，要存储一组字母
        char[] arr3;
//------------------------------------------------------------
        //2.2、静态初始化
        //数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3,...};
        int[] arr02 = new int[]{1,2,3,4};   //正确
        int[] arr03;
//        arr03 = {1,2,3};    //错误
        //new：关键字，创建数组使用的关键字。
        //因为数组本身是引用数据类型，所以要用new创建数组实体。
//------------------------------------------------------------


    }
}