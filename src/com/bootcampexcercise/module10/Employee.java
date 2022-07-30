package com.bootcampexcercise.module10;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Employee extends Person{

    private String jobTitle;
    private String company;
    private double salary;


    public Employee(){
        System.out.println("I'm Employee constructor");
    }

    public Employee(String jobTitle, String company, Double salary){
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public String getCompany(){
        return company;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String introduce(){
        String intro = "My name is " + getName() + " and I'm " + getAge() + " years old. \nI work as " + getJobTitle() + " in " + getCompany() + " and my salary is " + getSalary();
        return intro;
    }

    public String getHighestPaidEmp(List<Employee> list){
        String name = "";
        double max = 0.0;
        for(Employee nameOfMyObject : list) {
            if(max < nameOfMyObject.getSalary()){
                max = nameOfMyObject.getSalary();
                name = nameOfMyObject.getJobTitle();
            }
        }
        return name;
    }

    public String toString(){
        return this.jobTitle + " " + this.company + " " + this.salary;
    }

    void print(List list) {

        Iterator<Object> nameOfIterator = list.iterator();
        while (nameOfIterator.hasNext()) {
            System.out.println(nameOfIterator.next());
        }
    }
}
