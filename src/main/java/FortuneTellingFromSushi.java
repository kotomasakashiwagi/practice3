public class FortuneTellingFromSushi {
    //寿司占いの出力
    public static String fortuneTellingFromSushi(int i) {
        if (i == 0) {
            return "凶";
        } else if (i == 1) {
            return "凶";
        } else if (i == 2) {
            return "凶";
        } else if (i == 3) {
            return "吉";
        } else if (i == 4) {
            return "吉";
        } else if (i == 5) {
            return "凶";
        } else if (i == 6) {
            return "吉";
        } else if (i == 7) {
            return "大吉";
        } else if (i == 8) {
            return "凶";
        } else if (i == 9) {
            return "吉";
        } else {
            return "有効な数字を入れてください。";
        }
    }
}
