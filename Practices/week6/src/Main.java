public class Main {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        Lamp lamp = new Lamp();
        Button button = new Button(lamp, alarm);
        button.setCurrentMode(Mode.LAMP);
        button.pressed();

        button.setCurrentMode(Mode.ALARM);
        button.pressed();
    }
}
