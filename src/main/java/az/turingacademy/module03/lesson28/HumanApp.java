package az.turingacademy.module03.lesson28;

import az.turingacademy.module03.lesson28.controller.HumanController;
import az.turingacademy.module03.lesson28.dao.HumanDao;
import az.turingacademy.module03.lesson28.service.HumanService;

public class HumanApp {
    public static void main(String[] args) {
        HumanController humanController= new HumanController(new HumanService(new HumanDao()));
        Human human = new Human(1,"FAXI",23);
        Human human2 = new Human(2,"faxi",24);
        Human human3 = new Human(3,"Fexri",25);
        humanController.addAdam(human);
        humanController.addAdam(human2);
        humanController.addAdam(human3);
        System.out.println(humanController.findHumanByIndex(2));
        humanController.removeHuman(2);
        System.out.println(humanController.findHumanByIndex(0));
    }
}
