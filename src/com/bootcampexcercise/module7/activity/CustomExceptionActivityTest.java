package com.bootcampexcercise.module7.activity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class CustomExceptionActivityTest {
    //1 - Type main method and call validateUser() from it.
    //Call this method with different names to test it
    public static void main(String ags[]) throws CustomExceptionActivity {
        CustomExceptionActivityTest obj = new CustomExceptionActivityTest();
        obj.validateUser("Gabija");
        obj.validateUser("John");
    }

    void validateUser(String name) throws CustomExceptionActivity {
        //array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
//flag stores 1 if a match is found else it should remain 0
        int flag = 0;
        for (int i = 0; i < 4; i++) {
            if (name == validUsers[i]) {
                flag = 1;
            }
        }
        try {
            if (flag == 1) {
                throw new CustomExceptionActivity();
            }
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage() + " " + name);
        }
        if (flag == 0) {
            System.out.println("Welcome to Payroll program " + name);
        }
    }
}
