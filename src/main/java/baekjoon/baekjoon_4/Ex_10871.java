package baekjoon.baekjoon_4;
import java.util.Scanner;
public class Ex_10871 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int[] array = new int[n];
        int a;

        for (a = 0; a < n; a++) {
            array[a] = s.nextInt();
        }
        for (a = 0; a < array.length; a++) {
            if (x > array[a])
                System.out.println(array[a]);
        }
    }
}
