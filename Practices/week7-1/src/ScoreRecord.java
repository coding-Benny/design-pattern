import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
    private MinMaxView minMaxView;
    private List<Integer> scores = new ArrayList<Integer>();

    public void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }

    public void addScore(int score) {
        scores.add(score);
        minMaxView.update();
    }

    public List<Integer> getScoreRecord() {
        return scores;
    }
}
