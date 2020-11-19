public class ThreeMusketeers extends CandyBar {
    @Override
    public CandyBar createCandyBar() {
        System.out.println("Creating ThreeMusketeers");
        return new ThreeMusketeers();
    }
}
