package beginner.chapter3;

public class exam06_01 {
    public static void main(String[] args) {
        int a,b;
        float c,d;

        a=100;
        b=a;

        c=111.1f;
        d=c;

        System.out.printf("a,b의 값 ==> %d, %d \n", a, b);
        System.out.printf("c,d의 값 ==> %5.1f, %5.1f \n", c, d);
    }
}
