package baekjoon;
import java.util.Scanner;
public class Ex_11382 {
    public static void main(String[] args) {
        long a, b, c;
        long result;

        Scanner s = new Scanner(System.in);
        a = s.nextLong();
        b = s.nextLong();
        c = s.nextLong();

        result = a + b + c;
        System.out.println(result);
    }
}
