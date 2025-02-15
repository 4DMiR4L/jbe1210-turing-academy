package az.turingacademy.module03.lesson29;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Group implements Serializable {
    private String groupName;
    private List<Student> students;

    public Group(String groupName) {
        this.groupName = groupName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Group{"
                + "groupName='" + groupName + '\''
                + ", students=" + students
                + '}';
    }
}


