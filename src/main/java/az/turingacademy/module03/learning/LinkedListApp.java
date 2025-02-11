package az.turingacademy.module03.learning;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListApp {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        list.add(1,"d");
        list.add(4,"e");

        list.addFirst("a");
        list.addLast("Frank");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        System.out.println(list.size());

        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println(queue.poll());

        System.out.println(queue.poll());
        System.out.println(queue.poll());

        Deque<String> deque = new LinkedList<>();
        deque.add("1");
        deque.add("2");

        System.out.println(deque.poll());
        System.out.println(deque.poll());


    }
}
