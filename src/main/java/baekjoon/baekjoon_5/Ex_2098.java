package baekjoon.baekjoon_5;
import java.util.Scanner;
public class Ex_2098 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        String astr = "" + a;
        String bstr = "" + b;
        String areverse = "";
        String breverse = "";

        for (int i = astr.length() - 1; i >= 0; i--) {
            areverse = areverse + astr.charAt(i);
        }
        for (int j = bstr.length() - 1; j >= 0; j--) {
            breverse = breverse + bstr.charAt(j);
        }
        int aresult = Integer.parseInt(areverse);
        int bresult = Integer.parseInt(breverse);

        if (aresult < bresult) {
            System.out.println(bresult);
        }else
            System.out.println(aresult);
    }
}
