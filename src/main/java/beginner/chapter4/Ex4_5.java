package beginner.chapter4;

public class Ex4_5 {
    public static void main(String[] args) {
        int a = 100, b = 200;

        System.out.printf("%d == %d 는 %s 이다.\n", a, b, a == b);
        System.out.printf("%d != %d 는 %s 이다.\n", a, b, a != b);
        System.out.printf("%d > %d 는 %s 이다.\n", a, b, a > b);
        System.out.printf("%d < %d 는 %s 이다.\n", a, b, a < b);
        System.out.printf("%d >= %d 는 %s 이다.\n", a, b, a >= b);
        System.out.printf("%d <= %d 는 %s 이다.\n", a, b, a <= b);

        System.out.printf("%d = %d 는 %s 이다.\n", a, b, a = b);

    }
}
