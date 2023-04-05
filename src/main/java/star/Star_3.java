package star;
import java.util.Scanner;
public class Star_3 {
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < Math.pow(3,n); i++) {
            for (int j = 0; j < Math.pow(3,n); j++) {
                f(i,j);
            }
            System.out.println();
        }
        System.out.println(sb.toString());
    }

    public static void f(int x, int y) {

        if(x < 3 && y < 3) {

            if(x % 3 == 1 && y % 3 == 1) {
                System.out.print("    ");
            }
            else {
                System.out.print("* * ");
            }
        } else {
            if(x % 3 == 1 && y % 3 == 1) {
                System.out.print("    ");
            }
            else {
                f(x/3,y/3);
            }
        }
    }
}
