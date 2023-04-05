package quiz;

import java.util.Scanner;

public class Quiz_2 {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i, j;
        for (i = 0; i < 2 * a; i++) {

                if (i <= a) {
                    for (j = 0; j < i; j++)
                        System.out.print("*");
            }else{
                    for (j = a; j > i - a; j--)
                        System.out.print("*");
                }
                System.out.println();

        }
    }
}

