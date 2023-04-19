package com.bridgelabz;



import java.util.ArrayList;
import java.util.Scanner;

public class Company  {
        ArrayList <Employee> employeeList = new ArrayList<>();
        public void addEmployee() {
                Scanner sc = new Scanner(System.in);

                Employee emp = new Employee();

                System.out.println("Enter the name: ");
                emp.setName(sc.next());


                System.out.println("Enter the age: ");
                emp.setAge(sc.nextInt());


                System.out.println("Enter the mobile number: ");
                emp.setPhoneNumber(sc.nextLong());


                System.out.println("Enter the city: ");
                emp.setCity(sc.next());


                System.out.println("Enter the state: ");
                emp.setState(sc.next());


                System.out.println("Enter the department: ");
                emp.setDepartment(sc.next());

                System.out.println();
                System.out.println("employee details");
                employeeList.add(emp);
                System.out.println(employeeList);
        }
//        public void display(){
//                System.out.println(employeeList);
//                System.out.println();
//
//        }
}
