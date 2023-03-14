package baekjoon_3;
import java.util.Scanner;
public class Ex_2438 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i, j;

        for (i = 1; i < n + 1; i++) {
            for (j = 0; j < i; j ++){
                System.out.print("*");
            }System.out.println();
        }

    }
}
