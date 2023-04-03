package chapter9;

public class Ex09_8 {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "Java IT CookBook";

        System.out.println("원 문자열 ==> [" + str1 +"]");
        System.out.println("원 문자열 ==> [" + str2 +"]");

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.contains("Java"));
    }
}
