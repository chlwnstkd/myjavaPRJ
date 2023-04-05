package beginner.chapter4;

public class Ex4_4 {
    public static void main(String[] args) {
        int a = 10, b;

        b = a++;
        System.out.printf("%d \n", b);

        b= ++a;
        System.out.printf("%d \n", b);
    }
}
