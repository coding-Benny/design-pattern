public class KoreaCandy extends CandyBar{
    @Override
    public CandyBar createCandyBar() {
        System.out.println("Creating Korea candy");
        return new KoreaCandy();
    }
}
