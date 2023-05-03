package string;

public class CompareTo {
    public static void main(String[] args) {

        //숫자형끼리의 비교
        //래퍼클래스만 가능
        System.out.println("----");
        //기준 값과 비교대상이 동일한 값일 경우 0
        //기준 값이 비교대상 보다 작은 경우 -1
        //기준 값이 비교대상 보다 큰 경우 1
        Integer x = 3;
        Integer y = 4;
        Double z = 1.0;
        System.out.println( x.compareTo(y) );
        System.out.println( x.compareTo(3) );
        System.out.println( x.compareTo(2) );
        System.out.println( z.compareTo(2.7) );

        //문자열끼리의 비교
        System.out.println("----");
        String str = "abcd";
        //기준값에 비교대상이 포함되어있을 경우 서로의 문자열 길이의 차이값을 리턴
        System.out.println(str.compareTo("abcd"));
        System.out.println(str.compareTo("ab"));
        System.out.println(str.compareTo("a"));
        System.out.println("".compareTo(str));
        //comparTo는 같은 위치의 문자만 비교하기 때문에,
        //첫번째 문자부터 순서대로 비교해서 다를 경우 같은 문자와 첫번째문자의 아스키값을 비교
        System.out.println("----");
        System.out.println(str.compareTo("c"));
        System.out.println(str.compareTo("cd"));
        //전혀 다른 문자열인 경우,
        //첫번째 문자끼리의 아스키값을 비교
        System.out.println("----");
        System.out.println(str.compareTo("zefd"));
        System.out.println(str.compareTo("zEFd"));
        System.out.println(str.compareTo("ABCD"));
    }
}
