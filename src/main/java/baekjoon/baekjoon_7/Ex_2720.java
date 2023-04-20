package baekjoon.baekjoon_7;
import java.util.*;
public class Ex_2720 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int[][] arr = new int[a][4];

        for (int i = 0; i < a; i++) {
            int m = s.nextInt();
            arr[i][0] = m / 25;
            arr[i][1] = m % 25 / 10;
            arr[i][2] = m % 25 % 10 / 5;
            arr[i][3] = m % 25 % 10 % 5;
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
