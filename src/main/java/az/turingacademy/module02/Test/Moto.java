package az.turingacademy.module02.Test;

public class Moto extends Cars{

    private String type;

    public Moto(String model, String color, String engineType, String type) {
        super(model, color, engineType);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Moto{" +

                "model=" + getModel() + '\''+
                ", enginetype=" + getEngineType() + '\''+
                ", color=" + getColor() +'\''+
                "type=" + type +
                '}';
    }
}
