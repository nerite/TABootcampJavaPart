package com.bootcampexcercise.module10;

public class AbstractActivity {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.setName("Neringa");
        e.setAge(38);
        e.setJobTitle("Tester");
        e.setCompany("Accenture");
        e.setSalary(70000);
        System.out.println(e.introduce());

        System.out.println("------------------------------------------");

        Students s = new Students();

        s.setSchoolName("KTU");
        System.out.println(s.introduce());

        /*
        I'm Employee constructor
        My name is Neringa and I'm 38 years old.
        I work as Tester in Accenture and my salary is 70000.0
        ------------------------------------------
        I'm Students constructor
        I am studying at KTU university
         */

    }
}

