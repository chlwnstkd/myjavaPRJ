package quiz;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Quiz_10_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            int num = in.nextInt();

            int index = 0;
            for (Integer e : list) {
                if (num > e) {
                    break;
                }
                index++;
            }

            list.add(index, num);
        }

        for (int i = 5; i < 5; i++) {
            System.out.print(list);
        }
    }
}

