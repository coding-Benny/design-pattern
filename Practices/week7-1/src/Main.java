public class Main {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        MinMaxView minMaxView = new MinMaxView(scoreRecord);
        DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
        DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
        scoreRecord.setMinMaxView(minMaxView);
        scoreRecord.addDataSheetView(dataSheetView3);
        scoreRecord.addDataSheetView(dataSheetView5);

        for (int index = 1; index <= 5; index++) {
            int score = index * 10;
            System.out.println("Adding " + score);
            scoreRecord.addScore(score);
        }
    }
}
