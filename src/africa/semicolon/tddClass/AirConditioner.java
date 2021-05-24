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
        if (isOn ==true) {
            temperature = tempIsOn;
        } else {

        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(temperature >=16 && temperature < 30) {
            temperature = temperature + 1;
        }else{
                temperature = temperature;
        }
    }

    public void decreaseTemperature() {
        if(temperature >16 && temperature < 30) {
            temperature = temperature - 1;
        }else{
            temperature = temperature;
        }
    }
}
