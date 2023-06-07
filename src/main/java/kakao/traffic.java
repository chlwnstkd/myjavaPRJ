package kakao;

import java.util.Scanner;

public class traffic {
    public static void main(String[] args) {
        traffic_solution solution = new traffic_solution();
        Scanner s = new Scanner(System.in);
        String aaa = s.nextLine();
        aaa = aaa.replace("[", "");
        aaa = aaa.replace("]", "");
        aaa = aaa.replace("” ", "");
        aaa = aaa.replace(" “", "");
        aaa = aaa.replace("”", "");
        aaa = aaa.replace("“", "");

        String[] lines = aaa.split(",");

        int result1 = solution.solution(lines);

        System.out.println("초당 최대 처리량: " + result1);
    }
}
