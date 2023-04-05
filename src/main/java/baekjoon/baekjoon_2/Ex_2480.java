package baekjoon.baekjoon_2;
import java.util.Scanner;
public class Ex_2480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        if(a == b && b == c)
        System.out.printf("%d", 10000 + a * 1000);
        else if (a == b || a == c)
            System.out.printf("%d", 1000 + 100 * a);
        else if (c == b)
            System.out.printf("%d", 1000 + 100 * b);
        else
            System.out.printf("%d", (Math.max(Math.max(a, b), c) * 100));
    }
}
