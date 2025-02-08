package az.turingacademy.module03.Searching;

import java.util.HashMap;
import java.util.Map;

public class StudentApp {
    public static void main(String[] args) {

        Map<StudentWrapper, String> map = new HashMap<>();
        map.put(new StudentWrapper(new Student(1, "Ali")), "A");
        map.put(new StudentWrapper(new Student(2, "Ali")), "B");
        map.put(new StudentWrapper(new Student(3, "Carl")), "C");

        map.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("Keys: " + map.keySet());


    }
}
