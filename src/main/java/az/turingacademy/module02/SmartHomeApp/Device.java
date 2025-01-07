package az.turingacademy.module02.SmartHomeApp;

public abstract class Device {
    public enum DeviceType {
        LIGHT , TERMOSTAT , CAMERA , DOORBELL;

    }

    private int id;
    private String name;
    private boolean status;
    private DeviceType deviceType;

    public Device(int id, String name, boolean status, DeviceType deviceType) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.deviceType = deviceType;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public boolean getStatus() {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
