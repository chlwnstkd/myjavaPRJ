package baekjoon.baekjoon_4;

import java.util.Scanner;
public class Ex_10807 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        int cnt = 0;

        for (int a = 0; a < n; a++) {
            array[a] = s.nextInt();
        }
        int v = s.nextInt();

        for (int a = 0; a < array.length; a++) {
            if (v == array[a]) {
                cnt++;
            }
        }
    System.out.println(cnt);

    }
}
