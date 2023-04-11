package game;

import java.util.Scanner;
import java.util.Arrays;

public class PSO_computer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int com;
        int user;
        int user_result = 0;
        int com_result = 0;
        String[][] result = new String[2][5];
        System.out.println("앞면이 선공입니다. 뒷면이 후공입니다.");
        System.out.println("동전을 던집니다.");
        int coin = (int) (Math.random() * 2);           //순서정하기
        if (coin == 0) {
            System.out.println("앞면이 나왔습니다");
        } else {
            System.out.println("뒷면이 나왔습니다");
        }
        for (; coin < 10; coin++) {       //게임 진행
            if (coin % 2 == 0) {
                System.out.println("당신의 차례입니다");
                System.out.println("슛 방향 : <1>왼쪽 <2>중앙 <3> 오른쪽");
                com = (int) (Math.random() * 3 + 1);
                user = s.nextInt();
                if (com == user) {
                    System.out.println("막혔습니다");
                    result[0][coin / 2] = "X";
                } else if (user > 3) {
                    System.out.println("골대를 벗어났습니다");
                    result[0][coin / 2] = "O";
                } else {
                    System.out.println("Goal!");
                    result[0][coin / 2] = "O";
                }
            }
            if (coin % 2 == 1) {
                System.out.println("컴퓨터의 차례입니다");
                System.out.println("막을 방향 : <1>왼쪽 <2>중앙 <3> 오른쪽");
                com = (int) (Math.random() * 3 + 1);
                user = s.nextInt();
                if (com == user) {
                    System.out.println("막았습니다");
                    result[1][coin / 2] = "X";
                } else {
                    System.out.println("Goal!");
                    result[1][coin / 2] = "O";
                }
            }
            if (coin % 2 == 1) {
                System.out.println(Arrays.deepToString(result));
            }
        }
        for (int i = 0; i < 5; i++) {           //결과 집계
            if (result[0][i].equals("O"))
                user_result++;
            if (result[1][i].equals("O"))
                com_result++;
        }
        if (user_result > com_result)            //결과 발표
            System.out.println("당신의 승리입니다");
        else if (user_result == com_result)
            System.out.println("무승부입니다");
        else
            System.out.println("컴퓨터의 승리입니다");
    }
}


