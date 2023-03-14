package org.example;

public class Quiz {
    public static void main(String[] args) {
        int i;
        int a;

        for (i = 1; i < 5; i++) {
            for (a = 0; a < i; a++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        if (i == 5)
            for (i = 3; i < 6; i++) {
                for (a = 6; a > i; a--) {
                    System.out.printf("*");
                }
                System.out.println();
            }
    }

    public static class Quiz_2 {
        public static void main(String []args) {
            int i;
            int a;

            for (i = 1; i < 5; i++) {
                for (a = 6; a > i; a--) {
                    System.out.printf(" ");
                }
                for (a = 0; a < i; a++) {
                    System.out.printf("*");}
                for (a = 1; a < i; a++) {
                    System.out.printf("*");
                }
                System.out.println();

            }
            for (i = 5; i>1; i--) {
                for (a =8; a > i; a--) {
                    System.out.printf(" ");
                }
                for (a = 2; a < i; a++) {
                    System.out.printf("*");}
                for (a = 3; a < i; a++) {
                    System.out.printf("*");
                }
                System.out.println();
            }
        }
    }
}
