package beginner.chapter8;

public class Ex08_04 {
    public static void main(String [] args) {
        int aa[] = {100, 200, 300, 400};
        int bb[] = new int[] {100,200,300};
        int cc[];
        cc = new int[] {100, 200};
        int[] dd = new int[1];
        dd[0] = 100;
        int i;

        System.out.println("aa 몇 개? : " + aa.length);
        for (i =0; i < 4; i++)
            System.out.printf("aa[%d]==>%d\t", i, aa[i]);
        System.out.printf("\n");

        System.out.println("bb 몇 개? : " + bb.length);
        for (i =0; i < 3; i++)
            System.out.printf("bb[%d]==>%d\t", i, bb[i]);
        System.out.printf("\n");

        System.out.println("cc 몇 개? : " + cc.length);
        for (i =0; i < 2; i++)
            System.out.printf("cc[%d]==>%d\t", i, cc[i]);
        System.out.printf("\n");

        System.out.println("dd 몇 개? : " + dd.length);
        for (i =0; i < 1; i++)
            System.out.printf("dd[%d]==>%d\t", i, dd[i]);
        System.out.printf("\n");

    }
}
