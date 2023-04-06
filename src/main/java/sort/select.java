package sort;
import java.util.Arrays;
import java.util.Scanner;
public class select {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int min;
        int [] array = new int [n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100) + 1;
        }
        for (int j = 0; j < array.length; j++) {
            min = array[j];
            for (int k =j; k < array.length; k++) {
                if (array[k] < min) {
                    int temp = array[k];
                    array[k] = min;
                    min = temp;

                }
            }
            array[j] = min;

        }
        System.out.print(Arrays.toString(array));
    }
}
