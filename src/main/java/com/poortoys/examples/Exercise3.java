package com.poortoys.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise3 {
    public static void main(String[] args) {


        HashMap<String, Integer> toys = new HashMap<>();
        toys.put("Bear", 1);
        toys.put("Rabbit", 2);
        toys.put("Cat", 3);
        toys.put("Barbie", 4);

        //System.out.println(toys.entrySet());
        //System.out.println(toys.keySet());
        //System.out.println(toys.values());

        Iterator<Map.Entry<String, Integer>> iterator = toys.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }

    }
}