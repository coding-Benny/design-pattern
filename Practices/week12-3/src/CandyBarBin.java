import java.util.ArrayList;
import java.util.List;

public class CandyBarBin {
    private List<CandyBar> candies = new ArrayList<>();
    private static final int LOW_STOCK_LEVEL = 3;
    // private String candyBarType;
    private CandyBar candyBar;

    /* public CandyBarBin(String candyBarType) {
        this.candyBarType = candyBarType;
    } */

    public CandyBarBin(CandyBar candyBar) {
        this.candyBar = candyBar;
    }

    public void restock() {
        if (getAmountInStock() < LOW_STOCK_LEVEL) {
            candies.add(candyBar.createCandyBar());
            /* 새로운 candyBar가 추가되면 코드를 추가해야 하므로 OCP 만족하지 않음 */
            /* if (candyBarType.equals("Snickers")) candies.add(new Snikers());
               else if (candyBarType.equals("KitKat")) candies.add(new KitKat());
               else if (candyBarType.equals("ThreeMusketeers")) candies.add(new ThreeMusketeers()); */
        }
    }

    private int getAmountInStock() {
        return candies.size();
    }
}
