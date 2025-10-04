package org.rough;

public class Course {

    public static void main(String[] args) {
        Department department1 = new Department();
        Department department2 = new Department();
        System.out.println(department1);
        department1.setStringContent("HR", 1);
        System.out.println(department1);
        department2.setStringContent("IT",2);

        System.out.println(department1.equals(department2));
    }
}
