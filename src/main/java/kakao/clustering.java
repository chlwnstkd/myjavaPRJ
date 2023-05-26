package kakao;

import java.util.HashSet;
import java.util.Scanner;

public class clustering {
    static char big(char a) {
        int b = a - 32;
        char c = (char) b;
        return c;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        char[] st1 = new char[str1.length()];
        char[] st2 = new char[str2.length()];
        HashSet<String> sr1 = new HashSet<>();
        HashSet<String> sr2 = new HashSet<>();
        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) < 123 && str1.charAt((i)) > 96) {
                st1[i] = big(str1.charAt(i));
            }else {
                st1[i] = str1.charAt(i);
            }
        }
        for(int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i) < 123 && str2.charAt((i)) > 96) {
                st2[i] = big(str2.charAt(i));
            }else {
                st2[i] = str2.charAt(i);
            }
        }
        for(int i = 0; i < st1.length-1; i++) {
            if((st1[i] <91 && st1[i] > 64) && (st1[i+1] <91 && st1[i+1] > 64)) {
                sr1.add(st1[i] + "" + st1[i+1]);
            }
        }
        for(int i = 0; i < st2.length-1; i++) {
            if((st2[i] <91 && st2[i] > 64) && (st2[i+1] <91 && st2[i+1] > 64)) {
                sr2.add(st2[i] + "" + st2[i+1]);
            }
        }
        int count = 0;
        int size1 = sr1.size();
        int size2 = sr2.size();
        for(int i = 0; i < size1; i++) {
            for(int j = 0; j < size2; j++) {
                if (sr1.equals(sr2)){
                    count++;
                    break;
                }
            }
        }
        float result = count/(float)(size1+size2-count);
        System.out.println((int)result*65536);
    }
}
