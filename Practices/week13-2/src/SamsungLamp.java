public class SamsungLamp extends DirectionLamp {
    @Override
    protected void doLight(Direction direction) {
        System.out.println("Samsung Lamp " + direction);
    }
}
