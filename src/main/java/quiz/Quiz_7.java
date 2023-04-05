package quiz;

public class Quiz_7 {
    public static void main(String[] args) {
        int i = 2, j = 1;
        while (i < 10) {
            if (j == 1)
                System.out.printf("%d단  ", i);
            System.out.printf("%2d X%2d = %2d  ", i, j, i * j);
            j++;
            if (j == 10) {
                i++;
                j = 1;
                System.out.println();
            }
        }
    }
}
