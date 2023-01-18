package org.Lab3Semana2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("student1",50);
        Student student2=new Student("student2",70);
        Student student3=new Student("student3",80);
        Student student4=new Student("student4",100);

        HashMap<String,Student> studentHashMap=new HashMap<>();

        studentHashMap.put(student1.getName(),student1);
        studentHashMap.put(student2.getName(),student2);
        studentHashMap.put(student3.getName(),student3);
        studentHashMap.put(student4.getName(),student4);

        System.out.println(studentHashMap);

        Student.increaseGrade(studentHashMap);

        System.out.println(studentHashMap);

    }
}