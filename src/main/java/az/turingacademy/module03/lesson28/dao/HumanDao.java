package az.turingacademy.module03.lesson28.dao;

import az.turingacademy.module03.lesson28.Human;

import java.util.ArrayList;

public class HumanDao {

    private ArrayList<Human> humans = new ArrayList<>();

    public Human getHumanByIndex(int id) {
        return humans.get(id);
    }

    public void addHuman(Human human) {
        humans.add(human);
    }

    public void removeHuman(int id) {
        humans.removeIf(h -> h.getId() == id);
    }


    public void updateHuman(Human human) {
        humans.set(humans.indexOf(human), human);
    }
}
