package quiz;

import java.util.LinkedList;
import java.util.Scanner;

public class Quiz_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 5; i++) {
            list.add(s.nextInt());                     //리스트에 값 추가
        }
        for(int i=0; i<5; i++){
            for (int j =i+1; j< list.size(); j++) {
                if (list.get(i) == list.get(j)) {     //인덱스 i번째 값이 인덱스 j번째 값과 값다면
                    list.remove(j);                   //인덱스 j를 삭제한다
                }
            }
        }
        list.forEach(sort -> System.out.print(sort + " ")); //람다식을 이용한 리스트값 출력
    }
}
