package org.example;

public class Quiz_5 {
    public static void main(String[] args) {
        for (int i = 2, j = 1; j < 10; j++) {                  //i는 단, j는 곱하는 수로 하여 한번 반복 될때마다 j를 1증가시켜 j가 10이 되기 전까지 반복
            System.out.printf("%d X %d = %d \n", i, j, i*j);   //i X j = ixj를 출력
            if(j == 9) {                                       //j가 9가 된다면
                i++;                                           //i를 1증가시킨다
                j =1;                                          //j를 1로바꿔 다시 반복될대 2부터 시작하게 한다
                System.out.printf("\n");                       //단수가 바뀌었으니 한줄 띈다
            }

            if(i == 10) {                                      //만약 i가 10이되면
                break;                                         //반복문을 끝낸다
            }
        }
    }
}
