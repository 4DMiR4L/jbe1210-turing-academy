package az.turingacademy.module03.learning;

import java.util.*;

public class TreeSetApp {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder());
        ts.add("A");
        ts.add("B");
        ts.add("C");
        System.out.println(ts);

        List<String> set = new ArrayList<>();
        set.add("A");
        set.add("B");
        set.add("C");

        TreeSet<String> ts2 = new TreeSet<>(set);
        System.out.println(ts2);

    }
}
