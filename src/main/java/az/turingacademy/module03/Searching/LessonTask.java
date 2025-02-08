package az.turingacademy.module03.Searching;

import java.util.*;
import java.util.stream.IntStream;

public class LessonTask {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 1; i <= 20; i++) {
//            list.add(i);
//        }
//        list.stream().filter(integer -> integer % 2 == 0).map(integer -> integer * 2).forEach(System.out::println);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("faxı");
        linkedList.add("ibrahim");
        linkedList.add("lale");
        linkedList.add("yeter");
        linkedList.add("senuber");
        linkedList.add("seyran");
        linkedList.add("aynur");
        linkedList.add("rena");
        linkedList.add("diber");
        linkedList.add("ali");

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList.stream().filter(String ->String.startsWith("a") || String.length()>5).forEach(linkedList2::add);
        System.out.println(linkedList2);

        Set<String> set = new HashSet<>();
        set.addAll(linkedList2);
        System.out.println(set);

        Queue<String> queue = new LinkedList<>();
        queue.addAll(set);
        System.out.println(queue);

        Stack<String> stack = new Stack<>();
        stack.addAll(queue);
        System.out.println(stack);

        IntStream.range(0, 100).filter(Integer -> Integer % 3 ==0 && Integer%5==0 ).map(Integer -> Integer * Integer).forEach(System.out::println);
    }
}