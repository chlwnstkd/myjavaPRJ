package beginner.chapter7;

public class Ex07_05 {
    public static void main(String[] args) {
        int a = 100;

        while (a == 200) {
            System.out.printf("whihle 문 내부에 들어 왔습니다. \n");
        }
        do {
            System.out.printf("do ~ whihle 문 내부에 들어 왔습니다. \n");
        }while (a == 200);
    }
}
