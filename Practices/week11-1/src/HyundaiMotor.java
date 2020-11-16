public class HyundaiMotor extends Motor {
    public HyundaiMotor(Door door) {
        super(door);
    }

    protected void moveMotor(Direction direction) {
        System.out.println("Hyndai Motor Initiated");
    }
}
