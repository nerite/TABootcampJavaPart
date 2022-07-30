package com.bootcampexcercise.module10;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {

        Employee empl1 = new Employee("Programmer","Google", 900000.0);
        Employee empl2 = new Employee("Pilot", "Wizz Air", 8000000.0);
        Employee empl3 = new Employee("Tester", "Accenture", 90000.0);
        Employee empl4 = new Employee("Salesman", "Lidl", 1000.0);
        Employee empl5 = new Employee("CEO", "SEB bank", 5000000.0);

        List<Employee> empList = new ArrayList<>();

        empList.add(empl1);
        empList.add(empl2);
        empList.add(empl3);
        empList.add(empl4);
        empList.add(empl5);

        Employee obj = new Employee();
        obj.print(empList);
        //empList.forEach(System.out::println);
        System.out.println("The Employee whose salary is the highest is: " + obj.getHighestPaidEmp(empList));

    }
}
