package az.turingacademy.module03.lesson21;

public class BoxGeneric <T>{

    private T object;

    public BoxGeneric() {

    }

    public T getObject() {
        return object;
    }

    public BoxGeneric(T object){
        this.object = object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
