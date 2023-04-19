package com.bridgelabz;

import java.util.concurrent.Callable;

public class CompanyMain {
    public static void main(String[] args) {

        Company obj = new Company();

        Company obj2 = new Company();

        for (int i=0;i<2;i++){
            obj.addEmployee();
            obj2.addEmployee();
        }
    }
}
