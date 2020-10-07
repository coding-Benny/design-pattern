public class Main {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        Button alarmButton = new Button(alarm);
        alarmButton.pressed();
    }
}
