package baekjoon_4;
import java.util.Scanner;

public class Ex_1546 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        float[] array = new float[n];
        float avg = 0;
        float max = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
            if (array[i] >max){
                max = array[i];
            }
        }
        for(int j = 0; j < array.length; j++) {
            avg += (array[j] / max * 100) / n;
        }
        System.out.println(avg);
    }
}
