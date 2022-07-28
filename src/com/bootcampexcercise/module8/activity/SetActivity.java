package com.bootcampexcercise.module8.activity;

import java.util.HashSet;
import java.util.Set;

public class SetActivity {
    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.
        HashSet nameSet = new HashSet();
        //Also try adding a few duplicate entries to this set.
        nameSet.add("Gabija");
        nameSet.add("Saule");
        nameSet.add("Gabija");
        nameSet.add("Nijole");
        nameSet.add("Benas");
        nameSet.add("Virga");

        //TODO: 2 - Call print method to print the set passed as its parameter.
        SetActivity obj = new SetActivity();
        obj.print(nameSet);
    }

    void print(Set set) {
        //TODO: 3 - Type code to print this set
        //Notice the order in which elements get printed.
        for (Object nameOfObj : set) {
            System.out.println(nameOfObj.toString());
        }
        System.out.println(set);
    }
}
