public class KitKat extends CandyBar {
    @Override
    public CandyBar createCandyBar() {
        System.out.println("Creating KitKat");
        return new KitKat();
    }
}
