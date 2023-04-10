package game;
import java.util.Scanner;
public class Rusian_rullet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("몇명이서 플레이하실건가요?");
        int n = s.nextInt();
        for (int i = 0; i < n-1; i++) {
            System.out.println("총을 장전합니다");
            int a = (int) (Math.random()*(n-i)+i);
            for (int j = i; j < n+1; j++) {

                System.out.println("딸깍");
                int b = s.nextInt();
                System.out.println("탕");
                if(j==a) {
                    System.out.println("WASTED");
                    if(i==n-2) {
                        System.out.println("END");
                    }
                    break;
                }
            }
        }
    }
}
