package student.examples;

public class Frige implements Switchable{
    private boolean isOn;
    private int volume;

    public Frige(int volume) {
        this.isOn = false;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Frige{" +
                "isOn=" + isOn +
                ", volume=" + volume +
                '}';
    }

    @Override
    public void switchOff() {
        this.isOn = false;
    }

    @Override
    public void switchOn() {
        this.isOn = true;
    }
    @Override
    public boolean isOn() {
        return isOn;
    }
}
