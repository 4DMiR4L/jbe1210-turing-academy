package az.turingacademy.module02.lesson11;

public class Cat extends Dog {

    private String gender;

    public Cat(String name, int age, String futures, String color, String gender) {
        super(name, age, futures, color);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", futures='" + getFutures() + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
