import java.util.InputMismatchException;

public class Question12 implements Question {

    @Override
    public void run() {
        SushiTablePrinter.printSushiTable();
        try {
            int i = IntScanner.scanSushi();
            String s = FortuneTellingFromSushi.fortuneTellingFromSushi(i);
            StringPrinter.printString(s);
        } catch (InputMismatchException e) {
            System.err.println("\"整数\" を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
