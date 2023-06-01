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
                    if ((mn[i][j] == mn[i][j + 1] && mn[i + 1][j + 1] == mn[i + 1][j]) && mn[i][j] == mn[i + 1][j]) {
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
        ncnt.clear();
    }

    static void conclusion(char[][] mn, int m, int n) {
        for (int j = 0; j < n; j++) {
            int row = m - 1;
            for (int i = m - 1; i >= 0; i--) {
                // 빈 공간인 경우 위에 있는 블록을 아래로 떨어뜨리기
                if (mn[i][j] != ' ') {
                    mn[row][j] = mn[i][j];
                    row--;
                }
            }
            // 남은 공간을 모두 빈 공간으로 채우기
            for (int i = row; i >= 0; i--) {
                mn[i][j] = ' ';
            }
        }
            for (int i = m - 1; i > 0; i--) {
            int ii = i - 1;
            for (int j = n - 1; j > -1; j--) {
                if (mn[i][j] == ' ') {
                    if (ii == 0) {
                        mn[i][j] = mn[ii][j];
                        mn[ii][j] = ' ';
                    } else if (mn[ii][j] == ' ') {
                        ii--;
                        j++;
                    } else {
                        mn[i][j] = mn[ii][j];
                        mn[ii][j] = ' ';
                        j++;
                    }
                }
            }
        }
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
        System.out.println();
        List<Integer> mcnt = new ArrayList<>();
        List<Integer> ncnt = new ArrayList<>();
        for (int k = 0; k < m; k++) {
            for (int q = 0; q < n; q++) {
                System.out.print(mn[k][q]);
            }
            System.out.println();
        }
        while (true) {
            if (overLap(mn, mcnt, ncnt, m, n) == 0) {
                break;
            }
            delete(mn, mcnt, ncnt);
            conclusion(mn, m, n);
            for (int k = 0; k < m; k++) {
                for (int q = 0; q < n; q++) {
                    System.out.print(mn[k][q]);
                }
                System.out.println();
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
}