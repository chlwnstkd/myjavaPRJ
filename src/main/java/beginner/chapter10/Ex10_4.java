package beginner.chapter10;

import java.util.Scanner;

public class Ex10_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        int result = 0;
        try {
            if (b == 0) {
                throw new Exception("0으로 나누려고요? 안됩니다.");
            }
            result = a / b;
        } catch (Exception e) {
            System.out.print("발생 오류 ==> " + e.getMessage());
        } finally {
            System.out.print(result);
        }
    }
}