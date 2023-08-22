package etc;

import java.util.*;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputArr = new int[10];
        for(int i = 0 ; i < inputArr.length; i++) {
            String input = sc.nextLine();
            inputArr[i]=Integer.parseInt(input.split(" ")[1]) -Integer.parseInt(input.split(" ")[0]);
        }
        int[] intArr = new int[10];
        for (int i = 0 ; i < intArr.length;i++) {
// 재귀함수
            intArr[i]=factorial(inputArr,i);
        }
//최대값은
        System.out.println(max(intArr));

    }
    static int factorial(int[] inputArr,int i) {

        if(i==0) return inputArr[i];

        return inputArr[i] + factorial(inputArr,i-1);
    }
    static int max(int[] intArr) {
        int max=0;
        int maxIndex=0;
        for(int i=0;i<intArr.length;i++) {
            if(intArr[i]>max) {
                max=intArr[i];
                maxIndex=i;
            }
        }
        return intArr[maxIndex];
    }
}
