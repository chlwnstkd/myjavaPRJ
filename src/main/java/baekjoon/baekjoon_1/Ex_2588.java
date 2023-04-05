package baekjoon.baekjoon_1;
import java.util.Scanner;
public class Ex_2588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int c = (b / 100) * a;
        int d = (b % 10) * a;
        int e = ((b % 100) / 10) * a;

        System.out.println(d);
        System.out.println(e);
        System.out.println(c);
        System.out.println(a * b);



    }
}
