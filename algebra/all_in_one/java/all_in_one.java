import java.util.Scanner;
public class all_in_one {
    public static String s,S1;

    static void op(int x, int y) {
        if ("ADD".equals(S1)) {
            System.out.println(x + y);
        } else if ("SUB".equals(S1)) {
            System.out.println(x - y);
        } else if ("DIV".equals(S1)) {
            System.out.println(x / y);
        } else if ("MUL".equals(S1)) {
            System.out.println(x * y);
        } else if ("POW".equals(S1)) {
            System.out.println((int) Math.pow(x, y));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        S1 = s.substring(0,s.indexOf("("));
        S1=S1.trim();
        String S2 = s.substring(s.indexOf("(")+1,s.indexOf(","));
        S2=S2.trim();
        String S3 = s.substring(s.indexOf(",")+1,s.indexOf(")"));
        S3=S3.trim();
        int a = Integer.parseInt(S2);
        int b = Integer.parseInt(S3);
        op(a,b);
    }
}
