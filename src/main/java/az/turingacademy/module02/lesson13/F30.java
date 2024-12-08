package az.turingacademy.module02.lesson13;

public class F30 extends Bmw{

    private int hp;

    public F30(int hp) {
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
        return "F30{" +
                "hp=" + hp +
                '}';
    }
}
