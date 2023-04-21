package baekjoon.baekjoon_7;

import java.util.Scanner;

public class Ex_2903 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 2;
        for (int i = 1; i < n+1; i++) {
            a = a + a-1;
        }
        System.out.print(a * a);
    }
}