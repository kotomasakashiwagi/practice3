import java.util.InputMismatchException;

public interface Question {
    void run();
}

class Question1 implements Question {

    @Override
    public void run() {
        try {
            IntPair intPair = IntScanner.scanIntPair();
            EnumOfCompareXY.CompareXY enumXY = UtilityOfIntPair.judgeXBiggerThanY(intPair);
            StringPrinter.printIsXBiggerY(enumXY);
        } catch (InputMismatchException e) {
            System.err.println("有効な数字を入力してください。");
        }
    }
}

class Question2 implements Question {

    @Override
    public void run() {
        try {
        IntPair intPair = IntScanner.scanIntPair();
        EnumOfCompareXY.CompareXY enumXY = UtilityOfIntPair.judgeXBiggerThanY(intPair);
        StringPrinter.printBiggerInt(enumXY, intPair);
        } catch (InputMismatchException e) {
            System.err.println("有効な数字を入力してください。");
        }
    }
}

class Question3 implements Question {

    @Override
    public void run() {
        try {
            IntPair intPair = IntScanner.scanIntPair();
            EnumOfCompareXY.CompareXY enumXY = UtilityOfIntPair.judgeXBiggerThanY(intPair);
            StringPrinter.printIsXBiggerYOrNot(enumXY);
        } catch (InputMismatchException e) {
            System.err.println("整数　\"x y\" を入力してください。");
        }
    }
}

class Question4 implements Question {

    @Override
    public void run() {
        try {
            IntPair intPair = IntScanner.scanIntPair();
            EnumOfCompareXY.CompareXY enumXY = UtilityOfIntPair.judgeXBiggerThanY(intPair);
            StringPrinter.printIsXBiggerYOrNot(enumXY);
        } catch (InputMismatchException e) {
            System.err.println("整数　\"x y\" を入力してください。");
        }
    }
}

class Question5 implements Question {

    @Override
    public void run() {
        try {
            int x = IntScanner.scanPositiveX();
            boolean b = UtilityOfInt.isEven(x);
            StringPrinter.printEvenOrOdd(b);
        } catch (InputMismatchException e) {
            System.err.println("\"整数\"x を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println("正の数を入力してください。");
        }
    }
}

class Question6 implements Question {

    @Override
    public void run() {
        try {
            int x = IntScanner.scanIntX();
            String s = UtilityOfInt.groupNumber(x);
            StringPrinter.printString(s);
        } catch (InputMismatchException e) {
            System.err.println("\"整数\"x を入力してください。");
        }
    }
}

class Question7 implements Question {

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

class Question8 implements Question {

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

class Question9 implements Question {

    @Override
    public void run() {
        TablePrinter.printOnBusiness();
        try {
            IntPair intPair = IntScanner.scanIntPairOfReservation();
            boolean b = BusinessDayTable.isOnBusiness(intPair);
            StringPrinter.printIsOnBusiness(b);
        } catch (InputMismatchException e) {
            System.err.println("\"整数\" を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}

class Question10 implements Question {

    @Override
    public void run() {
        try {
            IntPair intPair = IntScanner.scanIntPair();//
            StringPrinter.printResultOf3_10(intPair);
        } catch (InputMismatchException e) {
            System.err.println("\"整数\" を入力してください。");
        }
    }
}

class Question11 implements Question {

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

class Question12 implements Question {

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

class Question13 implements Question {

    @Override
    public void run() {
        SushiTablePrinter.printSushiTable();
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

class OutOfQuestion implements Question {
    @Override
    public void run() {
        System.err.println("正しい問題番号を入力してください。");
    }
}