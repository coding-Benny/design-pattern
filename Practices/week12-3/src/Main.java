public class Main {
    public static void main(String[] args) {
        CandyStore myStore = new CandyStore();
        CandyBarBin bin1 = new CandyBarBin(new KitKat());
        myStore.add(bin1);
        bin1.restock();
        bin1.restock();
        bin1.restock();
        bin1.restock();
        CandyBarBin bin2 = new CandyBarBin(new Snickers());
        myStore.add(bin2);
        bin2.restock();
        bin2.restock();
        bin2.restock();
        bin2.restock();
        CandyBarBin bin3 = new CandyBarBin(new KoreaCandy());
        bin3.restock();
        bin3.restock();
        bin3.restock();
        bin3.restock();
    }
}
