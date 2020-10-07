public class Main {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        Lamp lamp = new Lamp();
        Command alarmStartCommand = new AlarmStartcommand(alarm);
        Button button = new Button();
        button.setCommand(alarmStartCommand);
        button.pressed();

        Command lampOnCommand = new LampTurnOnCommand(lamp);
        button.setCommand(lampOnCommand);
        button.pressed();

        Command tvOnCommand = new TvOnCommand(new TV());
        button.setCommand(tvOnCommand);
        button.pressed();
    }
}
