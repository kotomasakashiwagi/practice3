import java.util.Scanner;

public class IntScanner {
    public static IntPair scanIntPair() {
        System.out.println("整数　x,yを入力してください。例：3 2");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        return new IntPair(x, y);

    }

    //正の整数をスキャン
    public static int scanPositiveX() {

        int x = scanIntX();
        if (x < 0) {
            throw new IllegalArgumentException("正数字を入れてください");
        }
        return x;

    }

    //整数1つをスキャン
    public static int scanIntX() {
        System.out.println("整数xを入力してください。例：2");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();

    }

    //テストの点数をスキャン
    public static int scanScore() {
        int x = scanIntX();
        if (x < 0 || x > 100) {
            throw new IllegalArgumentException("正しい数字を入れてください。");
        }
        return x;
    }

    //テストの点数を二つスキャン
    public static IntPair scanScorePair() {
        IntPair intPair = scanIntPair();
        if (intPair.getX() < 0 || intPair.getX() > 100 || intPair.getY() < 0 || intPair.getY() > 100) {
            throw new IllegalArgumentException("正しい数字を入れてください。");
        }
        return new IntPair(intPair.getX(), intPair.getY());
    }

    //曜日と時間を数字に変換したintPair
    public static IntPair scanIntPairOfReservation() {
        System.out.println("上記にしたがって曜日と時間を数字で入れてください。例：2 1");
        IntPair intPair = scanIntPair();
        if (intPair.getX() < 0 || intPair.getX() > 6 || intPair.getY() < 0 || intPair.getY() > 2) {
            throw new IllegalArgumentException("正しい数字を入れてください。例：2 1");
        }
        return new IntPair(intPair.getX(), intPair.getY());
    }

    //月をスキャン
    public static int scanMonth() {
        System.out.println("2月 → 2　に習って");
        int x = scanIntX();
        if (x < 1 || x > 12) {
            throw new IllegalArgumentException("正しい数字を入れてください");
        }
        return x;


    }

    //リストから寿司を数字でスキャン
    public static int scanSushi() {
        System.out.println("例：まぐろ → 2");
        int x = scanIntX();
        if (x < 0 || x > 9) {
            throw new IllegalArgumentException("正しい数字を入れてください");
        }
        return x;
    }
}
