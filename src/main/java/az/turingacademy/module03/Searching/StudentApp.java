package az.turingacademy.module03.Searching;

import java.util.*;
import java.util.stream.Collectors;

public class StudentApp {
    public static void main(String[] args) {

        Map<Student, String> map = new HashMap<>();
        map.put(new Student(1, "Ali"), "A");
        map.put(new Student(2, "Ali"), "B");
        map.put(new Student(3, "Carl"), "C");

        map.forEach((k, v) -> System.out.println(k + " : " + v));



    }
}
