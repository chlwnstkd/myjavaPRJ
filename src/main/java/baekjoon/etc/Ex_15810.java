package baekjoon.etc;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_15810 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[] time = new int[N];
        for(int i=0;i<N;i++){
            time[i] = s.nextInt();
        }
        Arrays.sort(time);

        long left = 0;
        long right = (long)time[0]*(long)M;

        while(left<=right){
            long mid = (left+right)/2;
            long rem = 0;
            for(int i=0;i<N;i++){
                rem += mid/(long)time[i];
            }
            if(rem<M){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        System.out.println(left);
    }
}
