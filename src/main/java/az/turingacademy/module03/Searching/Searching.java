package az.turingacademy.module03.Searching;

import java.util.*;

public class Searching {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

//        Comparator<Person> agecomparator = new Comparator<Person>() {
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        };
//        people.sort(agecomparator);

        //Collections.sort(people , (o1, o2) ->o1.getAge() - o2.getAge());

        Collections.sort(people , (p2, p1) -> p2.getAge() - p1.getAge());

        for (Person person : people) {
            System.out.println(person);
        }

        people.forEach(System.out::println);
    }
}



