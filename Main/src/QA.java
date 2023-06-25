import java.util.Scanner;

public class QA {
    public static Scanner o = new Scanner(System.in);
    public static int one;
    public static int two;
    public static void name() {
        System.out.printf("pick a number : ");
        one = o.nextInt();
        System.out.printf("pick a another number : ");
        two = o.nextInt();
        System.out.printf("output : ");
        System.out.println(one+two);
    }
}
