public class Snickers extends CandyBar{
    @Override
    public CandyBar createCandyBar() {
        System.out.println("Creating Snickers");
        return new Snickers();
    }
}
