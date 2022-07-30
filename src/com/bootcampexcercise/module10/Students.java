package com.bootcampexcercise.module10;

public class Students extends Person{

    private String schoolName;

    public Students(){
        System.out.println("I'm Students constructor");
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public String introduce(){
        String intro = "I am studying at " + getSchoolName() + " university";
        return intro;
    }
}
