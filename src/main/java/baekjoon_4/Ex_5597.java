package baekjoon_4;
import java.util.Scanner;
public class Ex_5597 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int [] array = new int [31];

        for (int i = 1; i < 29; i++) {
            int success = s.nextInt();
            array [success] = 1;
        }
        for (int i = 1; i < array.length;i++) {
            if (array[i] != 1)
                System.out.println(i);
        }


    }
}
