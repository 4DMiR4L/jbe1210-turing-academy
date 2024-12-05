package az.turingacademy.module02.Test;

public class Car extends Cars {
    private int hp;

    public Car(String model, String color, String enginetype, int hp) {
        super(model, color, enginetype);
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "hp=" + hp +
                '\'' +
                ", model=" + getModel() +
                ", color=" + getColor() +
                ",enginetype=" + getEngineType() +

                '}';
    }
}
