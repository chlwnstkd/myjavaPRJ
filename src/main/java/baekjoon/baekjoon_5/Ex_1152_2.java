package baekjoon.baekjoon_5;

import java.util.Scanner;

public class Ex_1152_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int b = 0;
        if (!str.equals("")) {
            String st = str.trim();
            String arr[] = st.split(" ");
            b = arr.length;
        }
        System.out.print(b);
    }
}

