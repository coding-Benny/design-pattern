public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        Motor lgMotor = new LGMotor(door);
        lgMotor.move(Direction.UP);
    }
}
