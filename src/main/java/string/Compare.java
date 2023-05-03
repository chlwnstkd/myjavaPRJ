package string;

public class Compare {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "Java Programming";
        String str3 = new String("Java Programming");

        System.out.println("원 문자열 ==> [" + str1 + "]");
        System.out.println("원 문자열 ==> [" + str2 + "]");
        System.out.println("원 문자열 ==> [" + str3 + "]\n");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.contains("Java"));
    }
}
