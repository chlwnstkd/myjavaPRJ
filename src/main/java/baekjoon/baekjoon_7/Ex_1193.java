package baekjoon.baekjoon_7;

import java.util.Scanner;

public class Ex_1193 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int count = 0;
        int i = 1;
        int a = 0;
        int b = 0;
        while(count < x) {
            count = count + i;
            i++;
        }

        if((i-1)%2 == 0) {
            a = 1 + (count - x);
            b = (i-1) - (count-x);
        }else {
            a = (i-1) - (count-x);
            b = 1 + (count - x);
        }


        System.out.println(b  + "/" + a);
    }
}
