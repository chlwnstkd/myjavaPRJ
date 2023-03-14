package baekjoon_3;
import java.util.Scanner;
public class Ex_2739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, i;
        a = s.nextInt();

        for(i = 1; i < 10; i++)
        System.out.printf("%d * %d = %d \n", a, i, a * i);
    }
}
