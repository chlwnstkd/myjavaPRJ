package baekjoon_5;
import java.util.Scanner;
public class Ex_11720 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String input = s.next();
        int result = 0;
        for (int i = 0; i < a; ++i) {
            result += input.charAt(i) - '0';
        }
        System.out.println(result);
    }
}
