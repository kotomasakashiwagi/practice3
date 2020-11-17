import java.util.InputMismatchException;

public class Question7 implements Question {

    @Override
    public void run() {
        try {
            int x = IntScanner.scanScore();
            String s1 = ScoreTable.groupScore1(x);
            StringPrinter.printString(s1);
            String s2 = ScoreTable.groupScore2(x);
            StringPrinter.printString(s2);
            String s3 = ScoreTable.groupScore3(x);
            StringPrinter.printString(s3);
        } catch (InputMismatchException e) {
            System.err.println("\"整数\"x を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
