package com.train;

public class HealthReport implements  Report{

    @Override
    public void load() {
        System.out.println("Health Data Loading");
    }

    @Override
    public void print() {
        System.out.println("Health print");
    }
}
