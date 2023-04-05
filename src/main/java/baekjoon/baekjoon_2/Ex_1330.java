package baekjoon.baekjoon_2;
import java.util.Scanner;
public class Ex_1330 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int a, b;

        a = s.nextInt();
        b = s.nextInt();

        if (a > b)
            System.out.printf(">");
        if (a < b)
            System.out.printf("<");
        if (a == b)
            System.out.printf("==");
    }
}
