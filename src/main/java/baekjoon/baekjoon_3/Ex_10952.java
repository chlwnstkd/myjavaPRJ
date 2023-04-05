package baekjoon.baekjoon_3;
import java.util.Scanner;
public class Ex_10952 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int result;

        while (true) {
            a = s.nextInt();
            b = s.nextInt();
            result = a + b;


            if ((a == 0) && (b == 0)){
                s.close();
            break;
        }
            System.out.println(result);
    }
    }
}
