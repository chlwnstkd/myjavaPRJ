package baekjoon.baekjoon_2;

import java.util.Scanner;

public class Ex_2525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        int o, m;

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        o = a + c / 60;
        m = b + c % 60;

        if (o > 23) {
            if (m >= 60) {
                System.out.printf("%d %d \n", o - 23, m - 60);
            } else {
                System.out.printf("%d %d \n", o - 24, m);
            }
        }else{
                if (m >= 60) {
                    System.out.printf("%d \t %d \n", o + 1, m - 60);
                } else {
                    System.out.printf("%d \t %d \n", o, m);
                }
            }
    }
}

