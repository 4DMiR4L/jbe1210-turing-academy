package az.turingacademy.module03.lesson28.service;

import az.turingacademy.module03.lesson28.Human;
import az.turingacademy.module03.lesson28.dao.HumanDao;

public class HumanService {
    private  HumanDao humanDao;

    public HumanService(HumanDao humanDao) {
        this.humanDao = humanDao;
    }

    public Human getHumanByIndex(int id){
        return humanDao.getHumanByIndex(id);
    }
    public void addHuman(Human human){
        humanDao.addHuman(human);
    }
    public void removeHuman(int id){
        humanDao.removeHuman(id);
    }
    public void updateHuman(Human human){
        humanDao.updateHuman(human);
    }

}
