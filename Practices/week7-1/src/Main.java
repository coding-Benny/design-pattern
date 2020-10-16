import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        Observer minMaxView = new MinMaxView(scoreRecord);
        Observer dataSheetView3 = new DataSheetView(scoreRecord, 3);
        Observer dataSheetView5 = new DataSheetView(scoreRecord, 5);
        scoreRecord.attach(minMaxView);
        scoreRecord.attach(dataSheetView3);
        scoreRecord.attach(dataSheetView5);

        Observer sortedView = new SortView(scoreRecord);
        scoreRecord.attach(sortedView);

        Random random = new Random();
        for (int index = 1; index <= 5; index++) {
            int score = random.nextInt(101);
            System.out.println("Adding " + score);
            scoreRecord.addScore(score);
        }
    }
}
