

public class Scanner {
    public static IntPair scanIntPair() {
        System.out.println("整数　x,yを入力してください。例：2 3");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        try {
            int x = Integer.parseInt(scan.next());
            int y = Integer.parseInt(scan.next());
            return new IntPair(x, y);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
        //return null;
    }

    public static int scanPositiveX() {
        System.out.println("正の数xを入力してください。例：2");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        try {
            int x = Integer.parseInt(scan.next());
            if (x > 0) {
                return x;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

    }

    public static int scanIntX() {
        System.out.println("整数xを入力してください。例：2");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        try {
            return Integer.parseInt(scan.next());
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

    }

    public static int scanScore() {
        System.out.println("点数を入力してください。例：20");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        try {
            int x = Integer.parseInt(scan.next());
            if (x >= 0 && x <= 100) {
                return x;
            } else {
                throw new IllegalArgumentException("正しい数字を入れてください。");
            }

        } catch (NumberFormatException e) {
            throw e;
        }

    }

    public static IntPair scanScorePair() {
        System.out.println("点数xとyを入力してください。例：2 3");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        try {
            int x = Integer.parseInt(scan.next());
            int y = Integer.parseInt(scan.next());
            if (x >= 0 && x <= 100 && y >= 0 && y <= 100) {
                return new IntPair(x, y);
            } else {
                throw new IllegalArgumentException("正しい数字を入れてください。");
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static IntPair scanIntPairOfReservation() {
        System.out.println("上記にしたがって曜日と時間を数字で入れてください。例：2 1");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        try {
            int x = Integer.parseInt(scan.next());
            int y = Integer.parseInt(scan.next());
            if (x >= 0 && x <= 6 && y >= 0 && y <= 2) {
                return new IntPair(x, y);
            } else {
                throw new IllegalArgumentException("正しい数字を入れてください。例：2 1");
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static int scanMonth() {
        System.out.println("月を入力してください。2月 → 2");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        try {
            int x = Integer.parseInt(scan.next());
            if (x >= 1 && x <= 12) {
                return x;
            } else {
                throw new IllegalArgumentException("正しい数字を入れてください");
            }

        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

    }
}
