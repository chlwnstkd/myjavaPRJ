package baekjoon.baekjoon_7;

import java.util.Scanner;

public class Ex_2869 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = 0;
        int i=0;
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        while(true) {
            length += a;
            i++;
            if(length >= c) {
                break;
            }
            length -= b;
        }
        System.out.print(i);
    }
}
