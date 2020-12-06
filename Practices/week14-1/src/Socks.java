public class Socks extends ParcelItem {
//    private int weight;

    public Socks(int weight) {
        super(weight);
//        this.weight = weight;
    }
    @Override
    public int price() { return this.weight / 100 * 200; }
}
