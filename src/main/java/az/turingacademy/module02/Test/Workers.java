package az.turingacademy.module02.Test;

public class Workers extends Work {
    private int id;
    private String name;

    public Workers(String section, int id, String name) {
        super(section);
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", section='" + getSection() + '\'' +
                '}';
    }
}
