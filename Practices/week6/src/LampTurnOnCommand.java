public class LampTurnOnCommand implements Command {
    private Lamp lamp;

    public LampTurnOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }
}
