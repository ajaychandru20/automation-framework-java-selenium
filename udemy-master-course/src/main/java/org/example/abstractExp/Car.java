package org.example.abstractExp;

public class Car extends Vehicle {

//    Vehicle vehicle = new Vehicle();

    public static void main(String[] args) {
        Car car = new Car();
        car.setId(2);
        System.out.println(car.getId());
        ;
        car.bodyFrame(1, 2);
    }

    @Override
    public void bodyFrame(int num, int sum) {
        System.out.println("BMW Body frame");
    }
}
