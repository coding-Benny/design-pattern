import java.util.ArrayList;
import java.util.List;

public class Box extends ParcelItem {
//    private List<Trousers> trousers = new ArrayList<>();
//    private List<Socks> socks = new ArrayList<>();
//    private List<Gold> golds = new ArrayList<>();
//    private List<Box> boxes = new ArrayList<>();

    private List<ParcelItem> items = new ArrayList<>();

    public Box(int weight) {
        super(weight);
    }

    public int price() {
        int totalPrice = 0;
//        int tPrice = 0;
//        int sPrice = 0;
//        int gPrice = 0;
//        int bPrice = 0;

        for (ParcelItem item : items) {
            totalPrice += item.price();
        }
        return totalPrice;
//        for (Object o : items) {
//            totalPrice += o.price();
//            if (o instanceof Trousers) totalPrice += ((Trousers) o).price();
//            else if (o instanceof Socks) totalPrice += ((Socks) o).price();
//            else if (o instanceof Gold) totalPrice += ((Gold) o).price();
//            else if (o instanceof Box) totalPrice += ((Box) o).price();
//            else if (o instanceof Shirts) totalPrice += ((Shirts) o).price();
//        }
//        return o;
//        for (Trousers t : trousers) {
//            tPrice += t.price();
//        }
//
//        for (Socks s : socks) {
//            sPrice += s.price();
//        }
//
//        for (Gold g : golds) {
//            gPrice += g.price();
//        }
//
//        for (Box b : boxes) {
//            bPrice += b.price();
//        }
//
//        return tPrice + sPrice + gPrice + bPrice;
    }

//    public void addSocks(Socks s) { socks.add(s); }
//    public void addTrousers(Trousers t) { socks.add(t); }
//    public void addGolds(Gold g) { socks.add(g); }
//    public void addBoxes(Box b) { socks.add(b); }

//    public void addItems(Object o) { items.add(o); }
    public void addItems(ParcelItem item) { items.add(item); }
}
