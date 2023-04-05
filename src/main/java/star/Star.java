package star;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i, j;

        for (i = 1; i < n + 1; i++) {
            for (j = n; j > i; j--) {
                System.out.printf(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

            for (i = n; i > 1; i--) {
                for (j = n + 1; j > i; j--) {
                    System.out.printf(" ");
                }
                for (j = 1; j < i; j++) {
                    System.out.printf("*");
                }
                for (j = 2; j < i; j++) {
                    System.out.printf("*");
                }
                System.out.println();
            }

        }
    }

