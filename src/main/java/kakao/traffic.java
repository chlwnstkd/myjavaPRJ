package kakao;

import java.util.Arrays;
import java.util.Scanner;

public class traffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aaa = sc.nextLine();
        aaa = aaa.replace("[", "");
        aaa = aaa.replace("]", "");
        aaa = aaa.replace("”", "");
        aaa = aaa.replace("“", "");
        String[] enter = aaa.split(",");
        double[] endtime = new double[enter.length];
        double[] starttime = new double[enter.length];
        double[] runtime = new double[enter.length];
        for (int i = 0; i < enter.length; i++) {
            int a = enter[i].lastIndexOf(":");
            int b = enter[i].indexOf("s");
            System.out.println(enter[i].substring(a+1, a+7));
            double s = Double.parseDouble(enter[i].substring(a+1, a+7));
            float m = Math.round(Float.parseFloat(enter[i].substring(a-2, a)));
            float h = Math.round(Float.parseFloat(enter[i].substring(a-5, a-3)));
            endtime[i] = s * 60 * 60000 + m * 60000 + h;
            runtime[i] = Math.round((Float.parseFloat(enter[i].substring(a+8, b)) * 1000) / 1000.00);
            starttime[i] = endtime[i] - runtime[i] + (float) 0.001;
        }
        System.out.println(Arrays.toString(starttime));
        System.out.println(Arrays.toString(endtime));
        System.out.println(Arrays.toString(runtime));
        int max = 0;
        for(int i = 0; i < starttime.length; i++) {
            for (int j = 0; j < starttime.length; j++) {
                for (float k = 0; k < runtime[i]; k+=0.001) {
                    int cnt = 0;
                    double temp = starttime[i];
                    if (starttime[i] > starttime[j] && starttime[i] + 1 < starttime[j]) {
                        cnt++;
                    } else if (starttime[i] < starttime[j] && starttime[i] + k > starttime[j]) {
                        cnt++;
                    } else if (starttime[i] < endtime[j] && starttime[i] + k > endtime[j]) {
                    }
                    if (max < cnt) {
                        max = cnt;
                        System.out.println(max);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
