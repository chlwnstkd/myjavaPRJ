package kakao;

import java.util.Arrays;
import java.util.Scanner;

public class shuttle_bus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String timetable = s.nextLine();
        int n = s.nextInt();
        int t = s.nextInt();
        int m = s.nextInt();
        timetable = timetable.replace("[", "");
        timetable = timetable.replace("]", "");
        timetable = timetable.replace("”", "");
        timetable = timetable.replace("“", "");
        timetable = timetable.replace(" ", "");
        String[] temp = timetable.split(",");
        int[][] time = new int[temp.length][2];
        for (int i = 0; i < temp.length; i++) {
            String[] tmp = temp[i].split(":");
            for (int j = 0; j < 2; j++) {
                String tmp2 = tmp[j];
                time[i][j] = Integer.parseInt(tmp2);
            }
        }
        int[] people = new int[temp.length];
        int[] people2 = new int[temp.length];
        for(int i = 0; i < temp.length; i++) {
            people[i] = time[i][0]*60 + time[i][1];
            people2[i] = people[i];
        }
        int d = t;
        int a = t;
        int c = n;
        int b = m;
        Arrays.sort(people);
        for(int k = 0; k < n; k++) {
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < people.length; j ++) {
                    if(people[j] < 9*60 + t) {
                        people[j] = 24 * 60;
                        b--;
                        break;
                    }
                }
            }
            t += a;
        }
        Arrays.sort(people2);
        int answer2[] = new int[2];
        if(b <= 0) {
            answer2[0] = (people2[c*m-2]-1)/60;
            answer2[1] = (people2[c*m-2]-1)%60;
        }else {
            int answer1 = (60 * 9) + (d*(c-1));
            answer2[0] = answer1/60;
            answer2[1] = answer1%60;
        }
        System.out.printf("\"%02d:%02d\"", answer2[0], answer2[1]);
    }
}

