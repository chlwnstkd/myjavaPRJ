package baekjoon.baekjoon_2;
import java.util.Scanner;
public class Ex_2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();

        if (b - 45 < 0) {
            if (a == 0) {
                System.out.printf("23\n");
                System.out.printf("%d\n", b + 15);
            }else{
                System.out.printf("%d\n", a - 1);
                System.out.printf("%d\n", b + 15);
            }} else {
            System.out.printf("%d\n", a);
            System.out.printf("%d\n", b - 45);
        }
    }
}
