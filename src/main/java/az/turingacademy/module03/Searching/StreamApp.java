package az.turingacademy.module03.Searching;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamApp {
    public static void main(String[] args) {

        List<String> stringlist = new ArrayList<>();
        stringlist.add("Azi");
        stringlist.add("Bdu");
        stringlist.add("sdu");
        stringlist.add("Dyia");
        stringlist.add("Xezer");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        stringlist.stream().filter(string -> string.length() > 3).forEach(System.out::println);
        stringlist.stream().filter(h1 ->h1.startsWith("A")).forEach(System.out::println);
        stringlist.stream().sorted((Comparator.naturalOrder())).forEach(System.out::println);
        integerList.stream().filter(integer -> integer > 3).forEach(System.out::println);
        integerList.stream().filter(integer -> integer.compareTo(4)<=0).forEach(System.out::println);

    }
}
