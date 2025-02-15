package az.turingacademy.module03.lesson29;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("eli", 20, 89.5);
        Student s2 = new Student("faxi", 25, 92.3);
        Student s3 = new Student("Celi", 21, 95.0);

        Group g1 = new Group("Java Developers");
        g1.addStudent(s1);
        g1.addStudent(s2);

        Group g2 = new Group("frontçular");
        g2.addStudent(s3);

        Turing turing = new Turing();
        turing.addGroup(g1);
        turing.addGroup(g2);

        String filename = "turing_data.ser";
        turing.saveToFile(filename);

        Turing readTuring = Turing.readFromFile(filename);
        System.out.println("obyekt " + readTuring);
    }
}

