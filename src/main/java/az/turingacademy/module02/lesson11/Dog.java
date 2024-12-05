package az.turingacademy.module02.lesson11;

public class Dog extends Animal {

    private String color;

    public Dog(String name, int age, String futures,  String color) {
        super(name, age, futures);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", futures='" + getFutures() + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
