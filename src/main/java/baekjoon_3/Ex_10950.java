package baekjoon_3;
import java.util.Scanner;
public class Ex_10950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, t, i;
        t = s.nextInt();

        for (i = 0; i < t; i++) {
            a = s.nextInt();
            b = s.nextInt();
            System.out.printf("%d \n", a + b);
        }
    }
}
