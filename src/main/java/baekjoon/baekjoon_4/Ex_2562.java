package baekjoon.baekjoon_4;

import java.util.Scanner;
public class Ex_2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int array[] = new int[9];
        int max=0;
        max = array[0];
        int i;
        int cnt = 0;

        for (i = 0; i < array.length; i++)
            array[i] = s.nextInt();

        for (int j = 0; j < array.length; j++) {

            if( array[j]>max) {
                max = array[j];
                cnt = j+1;
            }
        }

        System.out.println(max);
        System.out.println(cnt);
    }
}

