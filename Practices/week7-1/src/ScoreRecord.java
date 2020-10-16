import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
    private MinMaxView minMaxView;
    private List<DataSheetView> dataSheetViews = new ArrayList<DataSheetView>();
    private List<Integer> scores = new ArrayList<Integer>();

    public void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }

    public void addScore(int score) {
        scores.add(score);
        minMaxView.update();

        for (DataSheetView dataSheetView : dataSheetViews) {
            dataSheetView.update();
        }
    }

    public void addDataSheetView(DataSheetView dataSheetView) {
        dataSheetViews.add(dataSheetView);
    }

    public List<Integer> getScoreRecord() {
        return scores;
    }
}
