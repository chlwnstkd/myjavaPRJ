package beginner.Ex;
import java.util.Scanner;
public class Ex23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("문자열을 입력하세요 : ");
        String str = s.nextLine();
        String tt = "";

        int count = str.length();

        for (int i = 0; i < count; i++){
            tt += str.charAt(count - (i+1));
        }
        System.out.printf("내용을 거꾸로 출력 ==> %s \n", tt);
    }
}
