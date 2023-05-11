package sort;

import java.util.Scanner;

public class quick {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        while(true) {
            for(int i = 1; i <n;) {
                i = 1;
                if (arr[i] < arr[i-1]) {
                    i++;
                }

            }
        }
    }
}
