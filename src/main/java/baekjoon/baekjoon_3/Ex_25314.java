package baekjoon.baekjoon_3;
import java.util.Scanner;
public class Ex_25314 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i;

        for (i = 0; 4 * i < a; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
