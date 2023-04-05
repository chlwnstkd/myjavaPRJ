package baekjoon.baekjoon_1;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int input_a, input_b;
        int a, b, c, e;
        double d;

        Scanner s = new Scanner(System.in);
        input_a = s.nextInt();
        input_b = s.nextInt();

        a = input_a + input_b;
        b = input_a - input_b;
        c = input_a * input_b;
        d = (double)input_a / input_b;
        e = input_a % input_b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
