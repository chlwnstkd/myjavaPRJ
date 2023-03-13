package baekjoon_2;
import java.util.Scanner;
public class Ex_14681 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int x, y;
        x = s.nextInt();
        y = s.nextInt();

        if (x < 0)
            if (y < 0)
                System.out.println("3");
            else
                System.out.println("2");
        else
            if (y < 0)
                System.out.println("4");
            else
                System.out.println("1");

    }
}
