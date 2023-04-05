package baekjoon.baekjoon_4;
import java.util.Scanner;
public class Ex_10813 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = new int[s.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int m = s.nextInt();
        for (int i = 0; i < m; i++) {
            int a = s.nextInt() - 1;
            int b = s.nextInt() - 1;


                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;

        }
        String result = "";
        for (int i = 0; i <arr.length; i++ ) {
            result += arr[i] + " ";
        }
        System.out.println(result);
    }
}
