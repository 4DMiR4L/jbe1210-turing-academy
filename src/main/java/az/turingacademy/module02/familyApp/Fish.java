package az.turingacademy.module02.familyApp;

public class Fish extends Pet {


    public Fish(Species species, String nickName, int age, int trickLevels, String[] habits) {
        super(species, nickName, age, trickLevels, habits);
    }

    @Override
    public void respond() {
        System.out.println("The fish doesn't respond");
    }
    @Override
    public void eat() {
        System.out.println();
    }
}
