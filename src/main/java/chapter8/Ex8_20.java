package chapter8;
import java.util.Scanner;
public class Ex8_20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int a = s.nextInt();
        int[][] gugu = new int[a][b];
        int i, k;

        for (i = 0; i < a; i++)
            for (k = 0; k < b; k++)
                gugu[i][k] = (i + 1) * (k + 1);

        for (i = 0; i < a; i++) {
            for (k = 0; k < b; k++) {
                System.out.printf("%dX%d=%2d ", k + 1, i + 1, gugu[i][k]);
            }
            System.out.printf("\n");
        }
    }
}
