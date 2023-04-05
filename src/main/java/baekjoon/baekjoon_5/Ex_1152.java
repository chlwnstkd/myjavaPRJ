package baekjoon.baekjoon_5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_1152 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        StringTokenizer st = new StringTokenizer(str," ");

        System.out.println(st.countTokens());
    }
}
