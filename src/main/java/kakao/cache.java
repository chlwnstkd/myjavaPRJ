package kakao;

import java.util.Scanner;

public class cache {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String cities = s.nextLine();
        int cacheSize = s.nextInt();
        String[] size = new String[cacheSize];
        cities = cities.replace("[", "");
        cities = cities.replace("]", "");
        cities = cities.replace("”", "");
        cities = cities.replace("“", "");
        cities = cities.replace(",", "");
        String[] temp = cities.split(" ");
        int time = 0;
        int a = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < cacheSize; j++) {
                if (temp[i].equals(size[j])) {
                    time += 1;
                    System.out.println(time);
                    break;
                }
                if (j == cacheSize - 1) {
                    size[a] = temp[i];
                    time += 5;
                    System.out.println(time);
                    break;
                }

            }
            a++;
            if (a == cacheSize) {
                a = 0;
            }
        }
        System.out.print(time);
    }
}
