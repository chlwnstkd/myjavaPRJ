package quiz;
import java.util.*;
public class Quiz_10_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < 5; i++){
            set.add(in.nextInt());
        }

        System.out.println(set);
    }
}
