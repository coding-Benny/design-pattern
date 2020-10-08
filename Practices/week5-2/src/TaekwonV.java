public class TaekwonV extends Robot {
    public TaekwonV(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Can only walk");
    }

    @Override
    public void attack() {
        System.out.println("Missile");
    }
}
