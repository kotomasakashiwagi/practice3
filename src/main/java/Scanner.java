

public class Scanner {
    public static IntPair scanIntPair() {
        System.out.println("整数　x,yを入力してください。例：20 30");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        try {
            int x = Integer.parseInt(scan.next());
            int y = Integer.parseInt(scan.next());
            return new IntPair(x, y);
        } catch (NumberFormatException e) {
            throw e;
        }

    }

    //正の整数をスキャン
    public static int scanPositiveX() {

        int x = scanIntX();
        if (x > 0) {
            return x;
        } else {
            throw new IllegalArgumentException();
        }

    }

    //整数1つをスキャン
    public static int scanIntX() {
        System.out.println("整数xを入力してください。例：2");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        try {
            return Integer.parseInt(scan.next());
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

    }

    //テストの点数をスキャン
    public static int scanScore() {
        int x = scanIntX();
        if (x >= 0 && x <= 100) {
            return x;
        } else {
            throw new IllegalArgumentException("正しい数字を入れてください。");
        }
    }

    //テストの点数を二つスキャン
    public static IntPair scanScorePair() {
        IntPair intPair = scanIntPair();
        if (intPair.getX() >= 0 && intPair.getX() <= 100 && intPair.getY() >= 0 && intPair.getY() <= 100) {
            return new IntPair(intPair.getX(), intPair.getY());
        } else {
            throw new IllegalArgumentException("正しい数字を入れてください。");
        }
    }

    //曜日と時間を数字に変換したintPair
    public static IntPair scanIntPairOfReservation() {
        System.out.println("上記にしたがって曜日と時間を数字で入れてください。例：2 1");
        IntPair intPair = scanIntPair();
        if (intPair.getX() >= 0 && intPair.getX() <= 6 && intPair.getY() >= 0 && intPair.getY() <= 2) {
            return new IntPair(intPair.getX(), intPair.getY());
        } else {
            throw new IllegalArgumentException("正しい数字を入れてください。例：2 1");
        }

    }

    //月をスキャン
    public static int scanMonth() {
        System.out.println("月を入力してください。2月 → 2");

        int x = scanIntX();
        if (x >= 1 && x <= 12) {
            return x;
        } else {
            throw new IllegalArgumentException("正しい数字を入れてください");
        }


    }

    //リストから寿司を数字でスキャン
    public static int scanSushi() {
        System.out.println("上記に従って番号を入力してください。まぐろ → 2");
        int x = scanIntX();
        if (x >= 0 && x <= 9) {
            return x;
        } else {
            throw new IllegalArgumentException("正しい数字を入れてください");
        }


    }
}
