package kakao;

import java.util.Arrays;
import java.util.Scanner;

public class shuttle_bus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int t = s.nextInt();
//        int m = s.nextInt();
        String timetable = s.nextLine();
        timetable = timetable.replace("[", "");
        timetable = timetable.replace("]", "");
        timetable = timetable.replace("”", "");
        timetable = timetable.replace("“", "");
        timetable = timetable.replace(",", "");
        String[] temp = timetable.split(" ");
        int[][] time = new int[temp.length][temp.length];
        for (int i = 0; i < temp.length; i++) {
            String[] tmp = temp[i].split(":");
            for (int j = 0; j < 2; j++) {
                String tmp2 = tmp[j];
                time[i][j] = Integer.parseInt(tmp2);
                System.out.println(time[i][j]);
            }
        }
        System.out.print(Arrays.deepToString(time));
    }
}

