package baekjoon.etc;

import java.util.Scanner;

public class Ex_1057 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int kim = sc.nextInt();
        int im = sc.nextInt();
        int a = 1;

        while(total > 1) {
            kim = devide(kim);
            im = devide(im);
            if(kim == im){
                break;
            }
            a++;
            total = total/2;
        }
        if (kim != im) {
            a = -1;
        }
        System.out.println(a);
    }
    private static int devide(int i) {
        int result;
        if (i % 2 == 1){
            result = i /2 + 1;
        } else {
            result = i /2;
        }
        return result;
    }
}
