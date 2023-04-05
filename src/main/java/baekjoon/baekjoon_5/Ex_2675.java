package baekjoon.baekjoon_5;
import java.util.Scanner;
public class Ex_2675 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        String resultStr = "";

        for (int i = 0; i < t; i++) {
            int r = s.nextInt();
            String str = s.next();

            for (int k = 0; k < str.length(); k++) {
                for (int j = 0; j < r; j++){
                    resultStr += str.charAt(k);
                }
            }

            System.out.println(resultStr);

            resultStr = "";
        }
    }
}
