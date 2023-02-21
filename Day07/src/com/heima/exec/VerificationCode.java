package com.heima.exec;

import javax.swing.text.Style;
import java.util.Arrays;
import java.util.Random;

/*
- 定义方法实现随机产生一个5位的验证码
- 验证码格式：
    - 长度为 5
    - 前四位是大写字母或小写字母
    - 最后一位是数字
 */
public class VerificationCode {
//    public static void main(String[] args) {
//        String[] str1 = new String[5];
//
//        for (int i = 0; i < str1.length-1; i++) {
//            str1[i] = String.valueOf((char)(Math.random() * 26 + 'A'));
////            System.out.println(str1[i]);
//        }
//        str1[str1.length-1] = String.valueOf((char)(Math.random() * 10 + '0'));
//
//        System.out.println(Arrays.toString(str1));
//    }
    public static void main(String[] args) {
        char[] chs = new char[52];

        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            }else{
                chs[i] = (char)(65 + i - 26);
            }
        }

        String result = "";

        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
             result = result + chs[randomIndex];
        }

        result = result + r.nextInt(9);
        System.out.println(result);

    }
}
