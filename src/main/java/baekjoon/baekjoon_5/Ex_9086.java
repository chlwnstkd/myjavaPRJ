package baekjoon.baekjoon_5;
import java.util.Scanner;
public class Ex_9086 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int iInput = sc.nextInt();

            String str[] = new String[iInput];
            for (int i = 0; i < iInput; i++) {
                str[i] = sc.next();
            }
            for (int i = 0; i < iInput; i++) {
                System.out.printf("%c%c\n",str[i].charAt(0), str[i].charAt(str[i].length() - 1));
            }
        }
    }

