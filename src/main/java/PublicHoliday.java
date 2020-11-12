public class PublicHoliday {
    private static String[] holiday = {"１月：元日、成人の日", "２月：建国記念の日", "３月：春分の日"
            , "４月：昭和の日", "５月：憲法記念日、みどりの日、こどもの日", "祝日はありません", "７月：海の日",
            "祝日はありません", "９月：敬老の日、秋分の日", "１０月：体育の日", "１１月：文化の日、勤労感謝の日",
            "１２月：天皇誕生日"};

    //その月の祝日を出力
    public static String findOutHoliday(int i) {
        return holiday[i - 1];
    }
}
