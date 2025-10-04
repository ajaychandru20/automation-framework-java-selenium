package org.rough;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    Map<String, Student> studentMap = new HashMap<>();

    public void addStudent(String key, Student value) {
        studentMap.put(key, value);
    }

    public void removeStudent(String key) {
        studentMap.remove(key);
    }

    public Student getStudent(String key){
        return studentMap.get(key);
    }
//    public Double getAverageGPA(){
//        studentMap.values();
//
//
//    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, 3.7);
        Student student2 = new Student("Bob", 21, 3.5);
        Student student3 = new Student("Charlie", 22, 3.9);

    }
}

class Student {
    String name;
    int age;
    double gpa;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
}
