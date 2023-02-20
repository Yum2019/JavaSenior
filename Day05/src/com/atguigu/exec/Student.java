package com.atguigu.exec;
/*
定义类Student，包含三个属性：学号number(int)，年级state(int)，
    成绩score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 */
public class Student {
    private int number; //学号
    private int state;  //年级
    private int score;  //成绩

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
}
