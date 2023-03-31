package org.example;

public class Quiz_5 {
    public static void main(String[] args) {
        for (int i = 2, j = 1; j < 10; j++) {
            System.out.printf("%d X %d = %d \n", i, j, i*j);
            if(j == 9) {
                i++;
                j =1;
                System.out.printf("\n");
            }

            if(i == 10) {
                break;
            }
        }
    }
}
