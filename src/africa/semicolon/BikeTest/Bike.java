package africa.semicolon.BikeTest;

public class Bike {

    private int speedInKmPerHour;
    private int currentGearNumber;

    public int getSpeedInKmPerHour() {
        return speedInKmPerHour;
    }
    public int getCurrentGearNumber() {
        return 0;
    }
    public void speedUp() {
        if (speedInKmPerHour == 20) {
            currentGearNumber = 2;
        }
        speedInKmPerHour = speedInKmPerHour + currentGearNumber;
    }
    public void setOn(boolean isOn) {
        currentGearNumber = 1;
    }
    public void setSpeedInKmPerHour(int speedInKmPerHour) {
        this.speedInKmPerHour = speedInKmPerHour;
    }
}
