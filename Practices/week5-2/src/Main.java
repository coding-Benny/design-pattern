public class Main {
    public static void main(String[] args) {
        Robot r1 = new TaekwonV("insang1");
        Robot r2 = new Atom("insang2");

        System.out.println(r1.getName());
        r1.move();
        r1.attack();

        System.out.println(r2.getName());
        r2.move();
        r2.attack();
    }
}
