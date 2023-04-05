package star;

import java.util.Scanner;

public class Star_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < 2 * n + 1; i++) {
            if (i < n+1) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 2 * n - 1; k > 2 * i; k--) {
                System.out.print(" ");
            }
            if (i != n)
                System.out.println("*");
            else
                System.out.println("");
        }
          else {
                for (int l = 2*n; l > i;l--) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int m = 2*n; m < 2*i-1 ; m++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
