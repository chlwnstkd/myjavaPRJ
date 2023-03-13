package baekjoon_2;
import java.util.Scanner;
public class Ex_2753 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int result;
        a = s.nextInt();

        if ((a % 4 == 0 || a % 100 == 0) && a % 400 == 0 ) {
            System.out.println("1");
//            if (a % 400 == 0)
//                System.out.println("1");
//            else if (a % 100 == 0)
//                System.out.println("0");
//            else
//                System.out.println("1");
        }
        else
            System.out.println("0");

    }
}
