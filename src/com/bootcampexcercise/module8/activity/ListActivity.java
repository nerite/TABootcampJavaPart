package com.bootcampexcercise.module8.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {
    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        List list = new ArrayList();
        list.add("Gabija");
        list.add("Saule");
        list.add("Nijole");
        list.add("Benas");
        list.add("Romas");
        //TODO: 2 - Call print method to print the list passed as its parameter.
        ListActivity obj = new ListActivity();
        obj.print(list);
    }

    void print(List list)
    {
        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.
        Iterator<Object> nameOfIter = list.iterator();
        System.out.println("--------Iterator----------");
        while(nameOfIter.hasNext()){
            System.out.println(nameOfIter.next());
        }
        System.out.println("--------for loop----------");
        for (Object namaOfObj : list){
            System.out.println(namaOfObj.toString());
        }
    }
}
