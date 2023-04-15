package com.bridgelabz;



import java.util.ArrayList;
import java.util.Scanner;

public class Company  {
        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<Employee>();
        public void compnay1() {
                Employee emp1 = new Employee();

                System.out.println("Enter the name: ");
                emp1.setName(sc.next());
                System.out.println(emp1.getName());

                System.out.println("Enter the age: ");
                emp1.setAge(sc.nextInt());
                System.out.println(emp1.getAge());

                System.out.println("Enter the mobile number: ");
                emp1.setPhoneNumber(sc.nextLong());
                System.out.println(emp1.getPhoneNumber());

                System.out.println("Enter the city: ");
                emp1.setCity(sc.next());
                System.out.println(emp1.getCity());

                System.out.println("Enter the state: ");
                emp1.setState(sc.next());
                System.out.println(emp1.getState());

                System.out.println("Enter the department: ");
                emp1.setDepartment(sc.next());
                System.out.println(emp1.getDepartment());

                System.out.println();

                Employee emp2 = new Employee();

                System.out.println("Enter the name: ");
                emp2.setName(sc.next());
                System.out.println(emp2.getName());

                System.out.println("Enter the age: ");
                emp2.setAge(sc.nextInt());
                System.out.println(emp2.getAge());

                System.out.println("Enter the mobile number: ");
                emp2.setPhoneNumber(sc.nextLong());
                System.out.println(emp2.getPhoneNumber());

                System.out.println("Enter the city: ");
                emp2.setCity(sc.next());
                System.out.println(emp2.getCity());

                System.out.println("Enter the state: ");
                emp2.setState(sc.next());
                System.out.println(emp2.getState());

                System.out.println("Enter the department: ");
                emp2.setDepartment(sc.next());
                System.out.println(emp2.getDepartment());

        }

        void companyDetails(){

        }
       public void compnay2(){

          compnay1();

       }


}
