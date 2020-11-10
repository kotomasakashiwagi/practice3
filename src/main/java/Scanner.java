public class Scanner {
    public static IntPair scanXY() {
        System.out.println("int型　x,yを入力してください。");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        return new IntPair(x, y);

    }
}
