package az.turingacademy.module02.familyApp;

public class Human {

    private String name;
    private String surname;
    private int dateOfBirth;
    private int IQ;
    private Pet pet;
//    private Mother mother;
//    private Father father;
    private String[][] shedule;


    public void greetPet() {
        System.out.println("hello," + pet.getNickName());
    }

    public void describePet() {
        String slyness = pet.getTrickLevels() > 50 ? "very sly" : "almost not sly";
        System.out.println("I have an" + pet.getNickName() + "is" + pet.getAge() + " years old" + "he is" + slyness);
    }


}
