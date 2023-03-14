package baekjoon_3;
import java.util.Scanner;
public class Ex_25304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, n, a, b, i;
        x = s.nextInt();
        n = s.nextInt();

        for (i = 0; i < n; i++ ){
            a = s.nextInt();
            b = s.nextInt();
            x = x - a * b;
        }
        if (x == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
