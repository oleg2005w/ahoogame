package student.examples;

public class Laptop implements HasPowerSafe{
//    private final byte OFF = 0;
//    private final byte ON = 1;
//    private final byte STANDBY = 2;
//    private final byte DIMMED = 3;
    private byte isOn;
    private int model;


    public Laptop(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "isOn=" + PowerMode.values()[isOn] +
                ", model=" + model +
                '}';
    }

    @Override
    public void switchOff() {
        this.isOn = 0;
    }

    @Override
    public void switchOn() {
        this.isOn = 1;
    }

    @Override
    public void standBy() {
        this.isOn = 2;
    }

    @Override
    public void dimmed() {
        this.isOn = 3;
    }

    @Override
    public boolean isOn() {
        return isOn > 0;
    }
}
