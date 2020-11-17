import java.util.InputMismatchException;

public class Question11 implements Question {

    @Override
    public void run() {
        try {
            int i = IntScanner.scanMonth();
            String s = PublicHoliday.findOutHoliday(i);
            StringPrinter.printString(s);
        } catch (InputMismatchException e) {
            System.err.println("\"整数\" を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
