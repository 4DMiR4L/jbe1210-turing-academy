package az.turingacademy.module03.learning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Setapp {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        s.add("A");
        s.add("B");
        Set<String> s2 = new HashSet<>();
        s2.add("A1");
        s2.add("B2");
        s.addAll(s2);
        System.out.println(s);

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        ArrayList<String> s3 = list;
        s3.add("A");
        s3.add("B");
        s3.addAll(list);
        System.out.println(list);


    }
}
