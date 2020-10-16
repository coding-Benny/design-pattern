import java.util.Collections;
import java.util.List;

public class SortView implements Observer {
    private ScoreRecord scoreRecord;

    public SortView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayScores(record);
    }

    private void displayScores(List<Integer> record) {
        System.out.println("Sorted View");
        Collections.sort(record);
        for (Integer score : record) {
            System.out.println(score);
        }
    }
}
