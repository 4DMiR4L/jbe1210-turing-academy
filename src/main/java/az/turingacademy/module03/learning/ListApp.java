package az.turingacademy.module03.learning;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<ListObj> list = new ArrayList<>();
        list.add(new ListObj(5,"faxi",35));
        list.add(new ListObj(6,"faxi",25));
        list.add(new ListObj(7,"faxi",45));
        list.stream().filter(h1 -> h1.getName().equals("faxi")).forEach(System.out::println);
        list.stream().filter(h1 -> h1.getAge() > 30).forEach(System.out::println);
    }
}
