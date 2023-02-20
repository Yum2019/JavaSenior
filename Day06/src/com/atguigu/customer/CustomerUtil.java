package com.atguigu.customer;

import java.util.Scanner;

public class CustomerUtil {
    static Scanner scan = new Scanner(System.in);



    /**
     从键盘录入1-5中的任意字符则方法返回。返回值为用户键入字符。*/
    public static int readMenuSelection() {
        char c;
        for (; ; ) {
            String s = readKeyBoard(1, false);
            c = s.charAt(0);
            if (c != '1' && c != '2' && c != '3' &&
                    c != '4' && c != '5') {
                System.out.println("请输入1-5范围内的整数");
            }else {
                break;
            }
        }
        return c;
    }

    /**
    public static char readChar() 和 public static char readChar(char defaultValue)
    从键盘读取一个字符，并将其作为方法的返回值。
     */
    public static char readChar(){
        String s = readKeyBoard(1, false);
        char c = s.charAt(0);
        return c;
    }

    /**   从键盘读取一个字符，并将其作为方法的返回值,
          如果回车，则返回默认值   */
    public static char readChar(char defaultValue){
        String s = readKeyBoard(1, true);
        return (s.length()==0) ? defaultValue:s.charAt(0);
    }

    /**
    public static int readInt() 和public static int readInt(int defaultValue)
	用途：这两个方法功能相同，均从键盘读取一个长度不超过2位的   整数，并将其作为方法的返回值。
     */
    public static int readInt(){
        int i;
        for (;;) {
            try {
                String s = readKeyBoard(2, false);
                i = Integer.parseInt(s);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入有误，请重新输入：");
            }
        }
        return i;

    }
    /**
    public static int readInt() 和public static int readInt(int defaultValue)
	用途：这两个方法功能相同，均从键盘读取一个长度不超过2位的   整数，并将其作为方法的返回值。
     */
    public static int readInt(int defaultValue){
        int i;
        for (;;) {
            String s = readKeyBoard(2, true);
            if (s.equals("")){
                return defaultValue;
            }else {
                try {
                    i = Integer.parseInt(s);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("数字输入错误，请重新输入:");
                }
            }
        }
        return i;
    }

    /**
     用于确认选择的输入。该方法从键盘读取‘Y’或’N’，并将其作为方法的返回值。
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("选择错误，请重新输入：");
            }
        }
        return c;
    }

    /**
    public static String readString(int limit)  和
	public static String readString(int limit, String defaultValue)
	用途：这两个方法功能相同，均从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值。
	参数：limit — 指定字符串的最大长度
		defaultValue — 如果用户不输入字符而直接回车，方法将以defaultValue 作为返回值。
     */
        public static String readString(int limit) {
            return readKeyBoard(limit, false);
        }


    public static String readString(int limit,String defaultValue){
        String str = readKeyBoard(limit, true);
        return str.equals("")? defaultValue : str;
    }


    /**可以通过键盘录入一定长度的string类型返回值*/
    public static String readKeyBoard(int limit,boolean blankReturn){
        String line = "";
        while (scan.hasNextLine()) {
            line = scan.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.println("输入的长度大于" + limit + "请重新输入。");
                continue;
            }
            break;
        }
        return line;
    }

}
