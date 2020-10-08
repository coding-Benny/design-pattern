public class Main {
    public static void main(String[] args) {
        Robot r1 = new TaekwonV("insang1");
        Robot r2 = new Atom("insang2");
        Robot r3 = new Sunguard("insang3");

        System.out.println(r1.getName());
        r1.setMovingStrategy(new WalkingStrategy());
        r1.setAttackStrategy(new MissileStrategy());
        r1.move();
        r1.attack();

        System.out.println(r2.getName());
        r2.setMovingStrategy(new FlyingStrategy());
        r2.setAttackStrategy(new PunchStrategy());
        r2.move();
        r2.attack();

        System.out.println(r3.getName());
        r3.setMovingStrategy(new JumpingStrategy());
        r3.setAttackStrategy(new MissileStrategy());
        r3.move();
        r3.attack();
    }
}
