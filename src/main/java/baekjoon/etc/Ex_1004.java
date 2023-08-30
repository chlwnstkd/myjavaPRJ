package baekjoon.etc;

import java.util.Scanner;

public class Ex_1004 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int[] result = new int[T];
        for(int i = 0; i < T; i++) {
            int sx = s.nextInt(); //출발지 x
            int sy = s.nextInt(); //출발지 y
            int ex = s.nextInt(); //도착지 x
            int ey = s.nextInt(); //도착지 y
            int n = s.nextInt(); //행성의 개수
            int count = 0;
            for(int j = 0; j < n; j++) {
                int x = s.nextInt();
                int y = s.nextInt();
                int r = s.nextInt();
                if((Math.pow(x-sx,2) + Math.pow(y-sy,2) < r*r) && (Math.pow(x-ex,2) + Math.pow(y-ey,2) < r*r)) {
                    continue;
                }
                else if (Math.pow(x-sx,2) + Math.pow(y-sy,2) < r*r) {
                    count++;
                }
                else if (Math.pow(x-ex,2) + Math.pow(y-ey,2) < r*r) {
                    count++;
                }
            }
            result[i] = count;
        }
       for(int answer : result) {
           System.out.println(answer);
        }
    }
}
