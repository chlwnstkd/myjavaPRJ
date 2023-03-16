package baekjoon_4;
import java.util.Scanner;
public class Ex_3052 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = s.nextInt() % 42;
        }
        for (int i = 0; i < array.length; i++) {
            int tmp = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    tmp++;
                }
            }
            if (tmp == 0)
                count++;
        }
        System.out.println(count);
    }
    }
