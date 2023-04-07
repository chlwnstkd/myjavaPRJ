package kakao;

import java.util.Arrays;
import java.util.Scanner;
public class secret_map {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char arr1[][] = new char[n][n];
        char arr2[][] = new char[n][n];
        char [][] result = new char[n][n];
        for (int i = 0; i < n; i++) {
            int input = s.nextInt();
            String a = Integer.toBinaryString(input);  //Integer.toBinaryString(정수) : 2진수를 10진수로 변환
            int t = n - a.length();
            for (int j = 0; j < a.length(); j++, t++) {
                arr1[i][t] = a.charAt(j);
            }

        }
        for (int i = 0; i < n; i++) {

            int input = s.nextInt();
            String b = Integer.toBinaryString(input);  //Integer.toBinaryString(정수) : 2진수를 10진수로 변환
            int t = n - b.length();

            for (int j = 0; j < b.length(); j++, t++) {
                arr2[i][t] = b.charAt(j);
            }

        }for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i][j] == '1' || arr2[i][j] == '1') {
                    result[i][j] = '#';
                } else
                    result[i][j] = ' ';
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}
