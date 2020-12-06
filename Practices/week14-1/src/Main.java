public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(0);
        Socks socks1 = new Socks(200);
        Socks socks2 = new Socks(300);
        Trousers trousers1 = new Trousers(600);
        box1.addItems(socks1);
        box1.addItems(socks2);
        box1.addItems(trousers1);
        System.out.println(box1.price());

        Box box2 = new Box(0);
        Gold gold1 = new Gold(800);
        box2.addItems(box1);
        box2.addItems(gold1);
        System.out.println(box2.price());

        Box box3 = new Box(0);
        Shirts shirts1 = new Shirts(500);
        box3.addItems(shirts1);
        box1.addItems(box3);
        System.out.println(box2.price());
    }
}
