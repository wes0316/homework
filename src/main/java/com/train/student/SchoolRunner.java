package com.train.student;

import java.util.Scanner;

public class SchoolRunner {

    public static void main(String[] args) {

        //userInput();
        student.pass =50;
        student stu = new student("Hank",98,10);
        student stu1 = new student("Eric",40,60);
        student stu2 = new student("Jane",30,55);
        stu.print();
        stu1.print();
        stu2.print();
        GraduateStudent gstu = new GraduateStudent("Jack",60,60,60);
                gstu.print();
       // System.out.println("High Score:" + stu.highest());
    }


    private  static  void  userInput(){
        System.out.println("Please enter  student's name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Please enter  student's english:");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math:");
        int math = scanner.nextInt();
        student stu =  new student(name,english,math);
        stu.print();
        System.out.println("High Score: "+ stu.highest());
    }
}
