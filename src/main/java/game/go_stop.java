package game;
import java.util.Scanner;
public class go_stop {
    // 1부터 30중 랜덤으로 숫자가 정해진다
    // 0부터 시작하여 go를 하면 1이 증가한다
    // stop을 하면 턴이 넘어가게된다.
    // 첫턴에 stop을 할 수 없다.
    // 서로 go를하다가 stack이 랜덤으로 정한 수로 만든 사람이 진다
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = (int) (Math.random()*30) + 1;
        int stack = 0;
        int i = 1;
            while(i < a+2) {
                System.out.printf("%d번째 턴입니다. \n", i);
                System.out.println("<1> GO <2> STOP");
                int answer = s.nextInt();
                    if (answer == 2 && i ==1) {
                        System.out.println("첫턴에 차례를 넘길수는 없습니다.");
                    }

                else if (answer == 1) {
                    stack++;
                    i++;
                }
                else if (answer == 2) {
                    System.out.println("차례를 넘깁니다.");
                    i=1;
                }
                else {
                    System.out.println("숫자를 다시 입력해주세요.");
                    i--;
                }
                if (stack == a) {
                    System.out.println("당신의 패배입니다.");
                    break;
                }
            }
        }
    }

