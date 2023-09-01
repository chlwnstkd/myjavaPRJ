package baekjoon.etc;

import java.util.Scanner;

public class Ex_1026 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int result = 0;
        for(int i = 0; i < N;i++){
            A[i] = s.nextInt();
        }

        for(int i = 0; i < N;i++){
            B[i] = s.nextInt();
        }
        for(int i = 0; i < N; i++) {
            int amin = A[i];
            int bmin = B[i];
            for( int j = i + 1; j < N; j++) {
                if ( amin > A[j]) {
                    int temp = amin;
                    amin = A[j];
                    A[j] = temp;
                }
                if ( bmin > B[j]) {
                    int temp = bmin;
                    bmin = B[j];
                    B[j] = temp;
                }
            }
            A[i] = amin;
            B[i] = bmin;
        }
        for(int i = 0; i < N;i++){
            result += A[i] * B[N-i-1];
            System.out.println(result);
        }
        System.out.println(result);
    }
}
