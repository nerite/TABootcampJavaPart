package com.bootcampexcercise.module10;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public double divide(double a, double b){
        double div = 0;
        try{
        if(a != 0 && b != 0) {
            div = a / b;
        } return div;
        }catch (Exception e){
            System.out.println("Please do not enter 0");
        }
        return div;
    }

    public int multiply(int[] num) throws CustomException{
        int ans = 1;
        for(int i=0; i<num.length; i++){
            ans = ans * num[i];
        }
        try{
            if(ans == 0){
                throw new CustomException();
            }
        } catch (CustomException e){
            System.out.println(e.getMessage());
        }
        return ans;
    }
}
