package others;

import java.util.Scanner;

public class cipher {
    public int cal(int b) {
        int count = 1;
        for(;;){
            b = b / 10;
            if (b == 0) {
                break;
            }
            count++;
        }
        return count;
    }
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("수를 입력하세요 : ");
        String a = s.nextLine();
        cipher ci = new cipher();
        char result;
        for(;;){
            System.out.print("몇의 자릿수를 구할것인가요?(0 입력시 종료) : ");
            int b = s.nextInt();
            if (b == 0){
                System.out.print("종료합니다.");
                break;
            }
            else{
                result = a.charAt(ci.cal(b));
            }
            System.out.println(a + "의 " + b + "의 자릿수는" + result + "입니다");
        }
    }
}
