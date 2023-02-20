package com.atguigu.exec;

/*
问题一：打印出3年级(state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建一个容纳20个学生的数组
        Student[] students = new Student[20];
        //给20个学生赋予类型和属性
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            //赋予三个属性的value
            students[i].setNumber(i + 1);
            //赋予随机数value
            students[i].setScore((int) (Math.random() * 6 + 1));
            students[i].setState((int) (Math.random() * 101));
        }

        //打印出3年级(state值为3）的学生信息。
        for (int i = 0; i < students.length; i++) {
            if (students[i].getScore() == 3) {
                System.out.println(students[i]);
            }
        }

        //使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getScore() > students[j + 1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

    }
}
