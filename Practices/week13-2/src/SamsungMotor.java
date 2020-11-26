public class SamsungMotor extends Motor {
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("Samsung motor is moving " + direction);
    }
}
