package baekjoon.etc;

import java.util.Scanner;

public class Ex_1043 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // 사람의 수
        int m = s.nextInt(); // 파티의 수
        int kn = s.nextInt(); // 진실을 아는 사람의 수
        int[] nn = new int[n]; // 진실을 아는 사람의 번호
        int fake = 0;
        for (int i = 0; i < kn; i++) {
            int temp = s.nextInt();
            nn[temp-1] = temp;
        }
        for (int i = 0; i < m; i++) {
            int mn = s.nextInt(); // 파티에 오는 사람의 수
            int[] mm = new int[mn]; // 파티에 오는 사람의 번호
            int check = 0;
            for(int j = 0; j < mn; j++) {
                mm[j] = s.nextInt();
                for(int k = 0; k < n; k++) {
                    if(nn[k] == mm[j]) {
                        check++;
                    }
                }
            }
            if(check == 0) {
                for(int j = 0; j < mn; j++) {
                    int temp = mm[j];
                    nn[temp-1] = temp;
                    fake++;
                }
            }
        }
        System.out.print(fake);
    }
}
