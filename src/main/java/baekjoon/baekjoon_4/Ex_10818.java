package baekjoon.baekjoon_4;

import java.util.Arrays;
import java.util.Scanner;
public class Ex_10818 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];

        int i;

        for (i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        System.out.println(Arrays.stream(array).min().getAsInt());
        System.out.println(Arrays.stream(array).max().getAsInt());
    }
}
