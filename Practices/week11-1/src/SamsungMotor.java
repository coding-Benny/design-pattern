public class SamsungMotor extends Motor {
    public SamsungMotor(Door door) {
        super(door);
    }

    protected void moveMotor(Direction direction) {
        System.out.println("Samsung Motor Initiated");
    }
}
