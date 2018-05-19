package com.company.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

//        ArrayList
//        String[]

        String []  s= new String[3];
        ArrayList<String> list = new ArrayList<>(); //collection (container)
        list.add("element0");
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        list.add("element5");
        list.add("element6");
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        //a, b, c, d
        //0, 1, 2, 3 ...

        //i = 0;
        //remove(i) -> a

        //b, c, d
        //0, 1, 2
        //next iteration
        //i = 1

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            list.remove(i);
//            list.get(10);
        }

        if (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        // ... more code

        iterator.next();

//        for (String string : list) {
//
//        }
    }
}
