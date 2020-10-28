public class Main {
    public static void main(String[] args) {
        Paengsu pengsu = new Paengsu();
        pengsu.setMoving(new Walking());
        pengsu.move();
        pengsu.setMoving(new Jumping());
        pengsu.move();
        pengsu.setMoving(new Flying());
        pengsu.move();
    }
}
