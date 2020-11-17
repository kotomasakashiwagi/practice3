import java.util.InputMismatchException;

public class Question8 implements Question {

    @Override
    public void run() {
        try {
            IntPair intPair = IntScanner.scanScorePair();
            String s = ScoreTable.groupScoreFrom2Tests(intPair);
            StringPrinter.printString(s);
        } catch (InputMismatchException e) {
            System.err.println("\"整数\" を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}