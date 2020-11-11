

public class Scanner {
    public static IntPair scanXY() {
        System.out.println("int型　x,yを入力してください。");
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
        System.out.println("int型　x(>0)を入力してください。");
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
        System.out.println("int型　xを入力してください。");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        try {
            return Integer.parseInt(scan.next());
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

    }

    public static int scanScore() {
        System.out.println("int型　点数を入力してください。");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        try {
            int x = Integer.parseInt(scan.next());
            if (x >= 0 && x <= 100) {
                return x;
            } else {
                throw new IllegalArgumentException();
            }

        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

    }
}
