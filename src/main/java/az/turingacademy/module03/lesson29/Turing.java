package az.turingacademy.module03.lesson29;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Turing implements Serializable {
    private List<Group> groups;

    public Turing() {
        this.groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Turing readFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Turing) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Turing{"
                + "groups=" + groups
                + '}';
    }
}
