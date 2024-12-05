package az.turingacademy.module02.lesson11;

public class Animal {
    private String name;
    private int age;
    private String futures;

    public Animal(String name, int age, String futures) {
        this.name = name;
        this.age = age;
        this.futures = futures;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFutures() {
        return futures;
    }

    public void setFutures(String futures) {
        this.futures = futures;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", futures='" + futures + '\'' +
                '}';
    }
}
