package baekjoon;
import java.util.Scanner;
public class Ex_10430 {
    public static void main(String[] args) {
        int input_a, input_b, input_c;
        int a, b, c, d;

        Scanner s = new Scanner(System.in);
        input_a = s.nextInt();
        input_b = s.nextInt();
        input_c = s.nextInt();

        a = (input_a + input_b) % input_c;
        b = ((input_a % input_c) + (input_b % input_c)) % input_c;
        c = (input_a * input_b) % input_c;
        d = ((input_a % input_c) * (input_b % input_c)) % input_c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
