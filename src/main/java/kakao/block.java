package kakao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class block {
    static int overLap(char[][] mn, List<Integer> mcnt, List<Integer> ncnt, int m, int n) {
        int result = 0;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (mn[i][j] != ' ') {
                    if ((mn[i][j] == mn[i][j + 1] && mn[i][j] == mn[i + 1][j]) && mn[i][j] == mn[i + 1][j + 1]) {
                        mcnt.add(i);
                        ncnt.add(j);
                        result++;
                    }
                }
            }
        }
        return result;
    }

    static void delete(char[][] mn, List<Integer> mcnt, List<Integer> ncnt) {
        for (int i = 0; i < mcnt.size(); i++) {
                mn[mcnt.get(i)][ncnt.get(i)] = ' ';
                mn[mcnt.get(i)][ncnt.get(i) + 1] = ' ';
                mn[mcnt.get(i) + 1][ncnt.get(i)] = ' ';
                mn[mcnt.get(i) + 1][ncnt.get(i) + 1] = ' ';
        }
        mcnt.clear();
        mcnt.clear();
    }

    static int conclusion(char[][] mn, int m, int n) {
        int result = 0;
        for (int i = m - 1; i > 0; i--) {
            int ii = i - 1;
            for (int j = n - 1; j > -1 && ii > -1; j--) {
                if (mn[i][j] == ' ') {
                    if (mn[ii][j] == ' ') {
                        ii--;
                        j++;
                        continue;
                    }
                    mn[i][j] = mn[ii][j];
                    mn[ii][j] = ' ';
                    i++;
                    result++;
                    break;
                }
                ii = i - 1;
            }
            for (int k = 0; k < m; k++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mn[k][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String aaa = s.nextLine();
        int m = s.nextInt();
        int n = s.nextInt();
        aaa = aaa.replace("[", "");
        aaa = aaa.replace("]", "");
        aaa = aaa.replace("”", "");
        aaa = aaa.replace("“", "");
        aaa = aaa.replace(" ", "");
        String[] board = aaa.split(",");
        char[][] mn = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mn[i][j] = board[i].charAt(j);
            }
        }
        for (int k = 0; k < m; k++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mn[k][j]);
            }
            System.out.println();
        }
        System.out.println();
        List<Integer> mcnt = new ArrayList<>();
        List<Integer> ncnt = new ArrayList<>();
        while (true) {
            if (overLap(mn, mcnt, ncnt, m, n) == 0) {
                break;
            }
            delete(mn, mcnt, ncnt);
            while (true) {
                if (conclusion(mn, m, n) == 0) {
                    break;
                }
            }
        }
        int answer = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mn[i][j] == ' ') {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}

/*
   de
   de
    f
    f
 */