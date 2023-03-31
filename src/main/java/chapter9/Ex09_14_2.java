package chapter9;
import java.util.Scanner;

public class Ex09_14_2 {
    static int calc(int v1, int v2, String op) {
        int result;

        switch(op) {
            case "+": result = v1 + v2;   break;
            case "-": result = v1 - v2;   break;
            case "*": result = v1 * v2;   break;
            case "/": result = v1 / v2;   break;
            default: result = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int res;
        int a, b;
        String oper;

        a = s.nextInt();
        oper = s.next();
        b = s.nextInt();
        res = calc(a,b,oper);

        System.out.printf("계산 결과는 : %d \n", res);
    }
}


