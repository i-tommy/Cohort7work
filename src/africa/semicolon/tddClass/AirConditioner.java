package africa.semicolon.tddClass;

public class AirConditioner {
    private boolean isOn;
    private String productName;
    private int temperature;


    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isEngineOn() {
        return isOn;
    }

    public void setTemperature(int tempIsOn) {
        temperature = tempIsOn;
    }

    public int getTemperature() {
        return temperature;
    }
}
