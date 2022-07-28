package com.bootcampexcercise.module8.activity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapActivity {
    public static void main(String[] args) {
        //1 - Type code to create a HashMap of key value pair
        //where key is id of type String and value is a name
        //2 - Call print method to print the map passed as its parameter.
    Map nameMap = new HashMap();
    nameMap.put("1", "Gabija");
    nameMap.put("2", "Saule");
    nameMap.put("3", "Nijole");
    nameMap.put("4", "Benas");
    nameMap.put("5", "Gintare");
    nameMap.put("7", "Gintare");
    nameMap.put("6", "Titas");

    MapActivity obj = new MapActivity();
    obj.print(nameMap);
    }

    void print(Map map)
    {
        //3 - Type code to print this map
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()){
            String key = (String) it.next();
            System.out.println(key + " " + map.get(key));
        }
    }
}
