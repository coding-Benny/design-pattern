public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Button lampButton = new Button(lamp);
        lampButton.pressed();
    }
}
