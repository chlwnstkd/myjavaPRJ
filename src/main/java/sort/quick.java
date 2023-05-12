package sort;

import java.util.Scanner;

public class quick {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        int k,j,p,count=0,coun=0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        while(true) {
            p = arr[0];
            k = arr[count];
            j = arr[n-1-coun];
            if(k>=p)
                count++;
            if(j<=p)
                coun++;
            else {

            }
        }
    }
}
