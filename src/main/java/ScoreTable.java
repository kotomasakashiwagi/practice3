public class ScoreTable {
    //６０点で合否判断
    private final static String GOUKAKU = "\"合格\"";
    private final static String HUGOUKAKU = "\"不合格\"";
    private final static String TAIHENYOKU = "\"大変よくできました。\"";
    private final static String YOKU="\"よくできました\"";
    private final static String ZANNEN="\"ざんねんでした。\"";
    private final static String YU = "\"優\"";
    private final static String RYO="\"良\"";
    private final static String KA="\"可\"";
    private final static String HUKA="\"不可\"";

    public static String groupScore1(int score) {
        if (score >= 60) {
            return GOUKAKU;
        } else {
            return HUGOUKAKU;
        }
    }

    //点数を３段階で評価
    public static String groupScore2(int score) {
        if (score >= 80) {
            return TAIHENYOKU;
        } else if (score >= 60) {
            return YOKU;
        } else {
            return ZANNEN;
        }
    }

    //点数を４段階で評価
    public static String groupScore3(int score) {
        if (score >= 80) {
            return YU;
        } else if (score >= 70) {
            return RYO;
        } else if (score >= 60) {
            return KA;
        } else {
            return HUKA;
        }
    }

    //２テストの条件で合否判断
    public static String groupScoreFrom2Tests(IntPair intPair) {
        if (intPair.getY() >= 60 && intPair.getX() >= 60) {
            return GOUKAKU;
        } else if (intPair.getY() + intPair.getX() >= 130) {
            return GOUKAKU;
        } else if (intPair.getY() >= 90 || intPair.getX() > 90) {
            return GOUKAKU;
        } else {
            return HUGOUKAKU;
        }
    }
}
