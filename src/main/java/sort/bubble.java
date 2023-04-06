package sort;

import java.util.Scanner;
import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        int temp;
        int k = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        for (int l = 0; l < n * (n - 1) / 2; l++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                } else if (array[j] == array[j + 1]) {
                    while (array[j] != array[j + k] || j + k == array.length - 1) {
                        k++;
                    }
                    if (array[j] > array[j + k]) {
                        temp = array[j];
                        array[j] = array[j + k];
                        array[j + 1] = temp;
                    }
                }
            }
        }


        System.out.print(Arrays.toString(array));
    }
}
