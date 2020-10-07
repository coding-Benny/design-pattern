public class AlarmStartcommand implements Command {
    private Alarm alarm;

    public AlarmStartcommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.start();
    }
}
