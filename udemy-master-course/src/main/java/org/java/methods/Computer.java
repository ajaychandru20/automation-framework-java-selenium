package org.java.methods;

public class Computer extends App {
    int RAM;
    String CPU;
    String Storage;
    String Monitor;

    void systemInfo(){
        System.out.println("The system contains RAM: " + RAM + " GB, CPU: " + CPU + ", Storage is: " + Storage + " , Monitor: " + Monitor);
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.systemInfo();

    }


}
