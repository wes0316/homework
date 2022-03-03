package com.train;

public class FinanceReport implements Report {
    @Override
    public void load() {
        System.out.println("Finance Data Loading");
    }

    @Override
    public void print() {
        System.out.println("Finance print");
    }




}
