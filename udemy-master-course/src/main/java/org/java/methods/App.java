package org.java.methods;

public class App {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.RAM = 1024;
        computer.CPU = "intel i7";
        computer.Monitor = "Dell Monitor";
        computer.Storage = "2TB NVMe";

        computer.systemInfo();
    }
}
