package quiz;

import java.util.Scanner;

public class Quiz_8 {
    public static void main(String[] args) {
        int n = 5;
        Scanner s = new Scanner(System.in);
        int min;
        int [] array = new int [n];
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    System.out.println("즁복이므로 다시 작성하세요");
                    i--;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j =i; j < array.length; j++) {
                if (array[j] < min) {
                    int temp = array[j];
                    array[j] = min;
                    min = temp;

                }
            }
            array[i] = min;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ",array[i]);
        }
    }
}
