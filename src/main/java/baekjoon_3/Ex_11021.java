package baekjoon_3;
import java.util.Scanner;
public class Ex_11021 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int i;

        for (i = 1; i < t + 1; i++) {
            int a = s.nextInt();
            int b = s.nextInt();

            System.out.println("Case #" + i +" : " + (a + b));
        }
        s.close();
    }
}
