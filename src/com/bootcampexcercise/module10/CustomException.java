package com.bootcampexcercise.module10;

public class CustomException extends Exception{

    public String getMessage(){
        return "Please do not use 0 when multiplying numbers";
    }
}
