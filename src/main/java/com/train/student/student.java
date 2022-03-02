package com.train.student;

public class student {

    String id;
    String name;
    int english;
    int math;
    static  int pass = 60;

    public student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest() {
      
        return (english > math) ? english : math;
    }

    public void print() {
        System.out.println(name + "\t" + english + "\t" + math + "\t" + getAvg());
        if (getAvg() >= pass) {
            System.out.println("\tPASS");
        } else {
            System.out.println("\tFAILED");
        }

    }

    public int getAvg() {
        return (english + math) / 2;
    }

}


