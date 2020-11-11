public class ScoreTable {
    public static String groupScore1(int score) {
        if (score >= 60) {
            return "\"合格\"";
        } else {
            return "\"不合格\"";
        }
    }

    public static String groupScore2(int score) {
        if (score >= 80) {
            return "\"大変よくできました。\"";
        } else if (score >= 60) {
            return "\"よくできました\"";
        } else {
            return "\"ざんねんでした。\"";
        }
    }

    public static String groupScore3(int score) {
        if (score >= 80) {
            return "\"優\"";
        } else if (score >= 70) {
            return "\"良\"";
        } else if (score >= 60) {
            return "\"可\"";
        } else {
            return "\"不可\"";
        }
    }
}
