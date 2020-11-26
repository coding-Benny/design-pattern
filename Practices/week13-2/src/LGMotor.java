public class LGMotor extends Motor {
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("LG motor is moving " + direction);
    }
}
