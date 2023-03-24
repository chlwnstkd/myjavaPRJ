package baekjoon_6;
import java.util.Scanner;
public class Ex_2444 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for (int i = 1; i < 2 * a; i++) {
            if (i < a) {
                for (int j = a; j > i; j--) {
                    System.out.print("*");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(" ");
                }
                for (int l = 1; l < i; l++) {
                    System.out.print(" ");
                }
                for (int m = a; m > i; m--) {
                    System.out.print("*");
                }
                System.out.println();
            }else {
                for (int j = a; j < i; j++) {
                    System.out.print("*");
                }
                for (int k = i; k < a * 2 - 1; k++) {
                    System.out.print(" ");
                }
                for (int l = i-1; l < a * 2 - 1; l++) {
                    System.out.print(" ");
                }
                for (int m = a; m < i; m++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
