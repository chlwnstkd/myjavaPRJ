package baekjoon_5;
import java.util.Scanner;
public class Ex_10809 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[26];
        String str = s.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
    }
}
