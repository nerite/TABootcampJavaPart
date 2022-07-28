package com.bootcampexcercise.module5.sample.polymorphism;

public class VirtualMethodSample {
    public static void main(String arg[]) {
        Person_P person = new Person_P();
        person.setName("John Doe");

        //Student inherits the methods and behavior from the Person class
        Student_P student = new Student_P();
        student.setName("Jane Doe");

        student.setSchool("A Fictional School");
        student.setGrade(10);

        rollCall(person);
        rollCall(student);
    }

    // Parent Instance defined in parameter of method
    public static void rollCall(Person_P temp) {
        temp.announce();
    }
}
