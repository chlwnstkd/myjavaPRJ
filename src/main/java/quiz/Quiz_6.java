package quiz;
import java.util.Scanner;
public class Quiz_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0, j = 1; j < 2 * n - 1; j++) {
            System.out.print("*");
            if (i < n) {
                if (j - 1 == i) {
                    System.out.printf("\n");
                    i++;
                    j = 0;
                }
            } else {
                if (j + 1 == n) {
                    System.out.printf("\n");
                    n--;
                    j = 0;
                }
            }
        }
    }
}
