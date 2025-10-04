package org.example.abstractExp;

public abstract class Vehicle {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void bodyFrame(int num, int sum);

}
