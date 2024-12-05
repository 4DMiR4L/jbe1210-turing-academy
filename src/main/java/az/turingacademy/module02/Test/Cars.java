package az.turingacademy.module02.Test;

public class Cars {

    private String model;
    private String color;
    private String engineType;

    public Cars(String model, String color, String engineType) {
        this.model = model;
        this.color = color;
        this.engineType = engineType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", engineType='" + getEngineType() + '\'' +
                '}';
    }
}
