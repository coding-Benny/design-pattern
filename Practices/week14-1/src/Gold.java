public class Gold extends ParcelItem {
//    private int weight;

    public Gold(int weight) {
        super(weight);
//        this.weight = weight;
    }

    public int price() { return this.weight / 100 * 2000; }
}
