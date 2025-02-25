package az.turingacademy.module03.reflection;

public class Cat {
    private final String name;
    private  int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sound() {
        System.out.println("meow");
    }

    private void privateMethod(){
        System.out.println("i am private");
    }

    public static void message() {
        System.out.println("i am static and public");
    }
    private static void mesage2_0(){
        System.out.println("i am static and private");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
