package baekjoon.baekjoon_3;
import java.util.Scanner;
public class Ex_8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, i;
        a = s.nextInt();
        b = 0;

        for (i = 1; i <= a; i++)
        {b += i;}
            System.out.println(b);
    }
}
