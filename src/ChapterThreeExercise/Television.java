package ChapterThreeExercise;

public class Television {
    private boolean isOn;
    private int channel;

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        if (!isOn) {
            return 0;
        }
        return channel;
    }

}