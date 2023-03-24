package baekjoon_6;
import java.util.Scanner;
public class Ex_10812 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();   //바구니 갯수
        int m = s.nextInt();   //회전 수
        int [] arr = new int[n];  //배열
        int count = 0;

        for (int b = 0; b < n; b++) {     //배열에 수 입력
            arr[b] = b + 1;
        }
        for (int a = 0; a < m; a++) {  //회전
            int i = s.nextInt();// begin
            int j = s.nextInt();// end
            int k = s.nextInt();// mid

            for (int c = k; c < j + 1; c++) { //배열정리
                count++;
                for (int d = c - 1; d > i - 2 + count; d--) {
                    int temp = arr[d];
                    arr[d] = arr[d-1];
                    arr[d-1] = temp;
                }
                }
            count = 0;
            }
        String result = "";
        for (int d = 0; d <arr.length; d++ ) {
            result += arr[d] + " ";
        } System.out.println(result);
    }
}

// arr   12345678910 164
// db    12345678910
//       45612378910
//