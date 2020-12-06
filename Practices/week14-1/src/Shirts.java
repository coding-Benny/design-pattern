public class Shirts extends ParcelItem {
//    private int weight;

    public Shirts(int weight) {
        super(weight);
//        this.weight = weight;
    }

    public int price() { return this.weight / 100 * 200; }
}
