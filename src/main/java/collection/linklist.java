package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class linklist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list.add(s.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for(int i=0; i<5; i++){
            for (int j =i+1; j< list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        list.forEach(sort -> System.out.print(sort + " "));
    }
}


