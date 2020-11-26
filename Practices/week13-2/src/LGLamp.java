public class LGLamp extends DirectionLamp {
    @Override
    protected void doLight(Direction direction) {
        System.out.println("LG Lamp " + direction);
    }
}
