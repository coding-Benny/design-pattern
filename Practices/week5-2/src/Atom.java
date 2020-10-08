public class Atom extends Robot {
    public Atom(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Can fly");
    }

    @Override
    public void attack() {
        System.out.println("Can punch");
    }


}
