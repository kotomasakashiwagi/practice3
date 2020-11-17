import java.util.InputMismatchException;

public class Question13 implements Question {

    @Override
    public void run() {
        try {
            int i = IntScanner.scanMonth();
            int i1 = DaysSearcher.searchDaysFromMonth(i);
            IntPrinter.printInt(i1);
        } catch (InputMismatchException e) {
            System.err.println("\"整数\" を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
