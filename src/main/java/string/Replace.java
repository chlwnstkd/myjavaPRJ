package string;

public class Replace {
    public static void main(String[] args) {
        String str = "aaabbbccccabcddddabcdeeee";

        String result1 = str.replace("a", "왕");
        String result2 = str.replace("a", "왕").replace("b", "왕").replace("c", "왕");
        String result3 = str.replaceAll("[abc]", "왕");
        String result4 = str.replaceFirst("[abc]", "왕");

        System.out.println("     replace result->" + result1);
        System.out.println("     replace result->" + result2);
        System.out.println("  replaceAll result->" + result3);
        System.out.println("replaceFirst result->" + result4);
    }
}
