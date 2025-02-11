package az.turingacademy.module03.learning;

import java.util.HashMap;

public class HashMapApp {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new java.util.HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        for(String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("----1---");


        map.getOrDefault(1,"A");
        System.out.println(map.get(1));
        System.out.println(map.containsValue("A")); //true
        System.out.println(map.containsKey(1)); //true
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("----2---");

        map.remove(2);
        System.out.println(map.get(2)); //null
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("----3---");

        map.replace(2, "D");
        System.out.println(map.get(2)); //null`
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("----4---");

        map.put(2,"d");
        System.out.println(map.get(2));

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("----5---");


    }
}
