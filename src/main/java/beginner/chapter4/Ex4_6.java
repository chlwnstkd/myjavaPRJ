package beginner.chapter4;

public class Ex4_6 {
    public static void main(String[] args){
        int a = 99;

        System.out.printf("AND 연산 : %s \n", (a >= 100) && (a <= 200));
        System.out.printf("OR 연산 : %s \n", (a >= 100) || (a <= 200));
        System.out.printf("NOT 연산 : %s \n", !(a >= 100));

    }
}
