enum Mode { LAMP, ALARM }

public class Button {
    private Alarm theAlarm;
    private Lamp theLamp;
    private Mode currentMode;

    public void setCurrentMode(Mode currentMode) {
        this.currentMode = currentMode;
    }

    public Button(Lamp theLamp, Alarm theAlarm) {
        this.theLamp = theLamp;
        this.theAlarm = theAlarm;
    }

    public void pressed() {
        switch (currentMode) {
            case LAMP:
                theLamp.turnOn();
                break;
            case ALARM:
                theAlarm.start();
                break;
        }
    }
}
