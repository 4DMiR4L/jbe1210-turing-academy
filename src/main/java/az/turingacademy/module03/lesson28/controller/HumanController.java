package az.turingacademy.module03.lesson28.controller;

import az.turingacademy.module03.lesson28.Human;
import az.turingacademy.module03.lesson28.service.HumanService;

public class HumanController {

    private HumanService humanService;

    public HumanController(HumanService humanService) {
        this.humanService = humanService;
    }

    public Human findHumanByIndex(int id) {
        return humanService.getHumanByIndex(id);
    }

    public void addAdam(Human adam) {
        humanService.addHuman(adam);
    }

    public void removeHuman(int id) {
        humanService.removeHuman(id);
    }


    public void updateHuman(Human human) {
        humanService.updateHuman(human);
    }
}
