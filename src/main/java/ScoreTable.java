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

    public static String groupScoreFrom2test(IntPair intPair) {
        if (intPair.getY() >= 60 && intPair.getX() >= 60) {
            return groupScore1(100);
        } else if (intPair.getY() + intPair.getX() >= 130) {
            return groupScore1(100);
        } else if (intPair.getY() >= 90 || intPair.getX() > 90) {
            return groupScore1(100);
        } else {
            return groupScore1(59);
        }
    }
}
