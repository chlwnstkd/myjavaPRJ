package kakao;

import java.util.Scanner;

public class darts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String dartResult = s.nextLine();
        String[] Result = dartResult.split("");
        int[] intResult = new int[3];
        String[] optionResult = new String[3];
        double[] bonusResult = new double[3];
        int a = 0, b = 0, i = 1;
        if (isNumber(Result[1])) {
            intResult[0] = 10;
            i++;
            a++;
        } else {
            intResult[0] = Integer.parseInt(Result[0]);
            a++;
        }
        for (; i < Result.length; i++) {
            if (isNumber(Result[i])) {
                if (isNumber(Result[i - 1])) {
                    intResult[a - 1] = 10;
                    a++;
                } else {
                    intResult[a] = Integer.parseInt(Result[i]);
                    a++;
                }
            } else if (Result[i].equals("*")) {
                optionResult[b - 1] = Result[i - 1] + "*";
            } else if (Result[i].equals("#")) {
                optionResult[b - 1] = Result[i - 1] + "#";
            } else {
                optionResult[b] = Result[i];
                b++;
            }
        }

        double result = 0;
        for (int j = 0; j < 3; j++) {
            bonusResult[j] = option(intResult[j], optionResult[j]);
            if (j == 0) {
                bonusResult[j] = bonus(optionResult[j], bonusResult[j]);
            } else {
                bonusResult[j] = bonus(optionResult[j], bonusResult[j-1], bonusResult[j]);
            }
            result += bonusResult[j];
        }
        System.out.print((int) result);
    }

    public static boolean isNumber(String s) {  //String가 정수인지 확인
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    static double option(int a, String b) {    //조건 확인
        double c = a;
        if (b.contains("S")) {
            c = Math.pow(c, 1);
        } else if (b.contains("D")) {
            c = Math.pow(c, 2);
        } else if (b.contains("T")) {
            c = Math.pow(c, 3);
        }
        return c;
    }

    static double bonus(String b, double bonusResult) {    //조건 확인
        double c = bonusResult;
        if (b.contains("*")) {
            c = c * 2;
        } else if (b.contains("#")) {
            c -= 2 * c;
        }
        return c;
    }
    static double bonus(String b, double postbonus, double bonusResult) {    //조건 확인
        double c = bonusResult;
        if (b.contains("*")) {
            c = c * 2 + postbonus;
        } else if (b.contains("#")) {
            c -= 2 * c;
        }
        return c;
    }
}
