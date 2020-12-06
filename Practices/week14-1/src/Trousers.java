public class Trousers extends ParcelItem {
//    private int weight;

    public Trousers(int weight) {
        super(weight);
//        this.weight = weight;
    }
    @Override
    public int price() { return this.weight / 100 * 200; }
}
