package az.turingacademy.module02.Test;

public class Work {
    private String section;

    public Work(String section) {
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Work{" +
                "section=" + section +
                ", name='" +  + '\'' +

                '}';
    }
}
