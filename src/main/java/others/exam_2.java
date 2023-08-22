package others;

import java.util.Arrays;

public class exam_2 {
    public static void main(String args[]) {
        int[] arr = {5, 3, 6, 1, 2, 4};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(number -> System.out.println("출력값 : " + number));
    }
}
