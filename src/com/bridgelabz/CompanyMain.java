package com.bridgelabz;

import java.util.concurrent.Callable;

public class CompanyMain {
    public static void main(String[] args) {

        Company obj = new Company();
        System.out.println("For company1: ");
        System.out.println("Enter the employee details:");
        obj.compnay1();

        System.out.println();
        System.out.println("Enter the employee details:");
        System.out.println("For company2: ");
        obj.compnay2();
    }
}
