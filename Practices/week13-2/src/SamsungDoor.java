public class SamsungDoor extends Door {
    @Override
    protected void doClose() {
        System.out.println("Close Samsung Door");
    }

    @Override
    protected void doOpen() {
        System.out.println("Open Samsung Door");
    }
}
