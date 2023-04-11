package game;
import java.util.Scanner;
import java.util.Arrays;
public class Baseball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correct[] = new int[3];
        int answer[] = new int[3];
        for(int i = 0; i < 3; i++) {
            correct[i] = (int) (Math.random() * 9 + 1);
            for (int j = 0; j < i; j++) {
                if(correct[i] == correct[j])
                    i--;
            }
        }
        System.out.println("게임을 시작합니다");
        for (int k = 1; ;k++ ) {
            int s=0,o=0,b = 0;
            System.out.println(k + "번째 도전입니다.");
            for (int i = 0; i < 3; i++) {
                answer[i] = sc.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (answer[i] == correct[j])
                        b++;
                }
                if (answer[i] == correct[i]) {
                    s++;
                    b--;
                }
            }
            o = 3 - s - b;
            System.out.printf("%d 스트라이크, %d 볼, %d 아웃 \n", s, b, o);
            if (s == 3) {
                System.out.println("모두 맞췄습니다. 정답은 " + Arrays.toString(correct) + "였습니다.");
                break;
            }
        }
    }
}