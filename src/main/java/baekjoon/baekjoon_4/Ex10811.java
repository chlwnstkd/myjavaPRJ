package baekjoon.baekjoon_4;

import java.io.IOException;
import java.util.Scanner;
public class Ex10811 {
    public static void main(String [] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int [] array = new int[s.nextInt()];
        for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
        }

        int m = s.nextInt();
        for (int i = 0; i < m; i++) {
            int a = s.nextInt() - 1;
            int b = s.nextInt() - 1;

            while (a < b) {
                int temp = array[a];
                array[a++] = array[b];
                array[b--] = temp;
            }
        }
        String ret = "";
        for (int j = 0; j <array.length; j++ ) {
                ret += array[j] + " ";
            }
        System.out.print(ret.trim());
        s.close();
    }
}
