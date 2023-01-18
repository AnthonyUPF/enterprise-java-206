package org.Lab3Semana2;

import java.util.HashMap;


public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        if(grade<0) {
            this.grade = 0;
        } else if (grade>100) {
            this.grade = 100;
        }else{
            this.grade = grade;
        }
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public static HashMap<String,Student> increaseGrade(HashMap<String,Student> hashMap){
        for(Student student: hashMap.values()){
            student.setGrade((int) (1.1*student.getGrade()));
        }
        return hashMap;
    }
}
