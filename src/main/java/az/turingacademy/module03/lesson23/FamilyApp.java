package az.turingacademy.module03.lesson23;

public class FamilyApp {
    public static void main(String[] args) {

        Person father = new Person(1l,"Father",40);
        father= father.setName("Faxi").setAge(21);
        System.out.println(father);

    }
}
