package string;

public class Substring {
    public static void main(String[] args) {
        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";
        String[] ip = log.split(" ");
        System.out.println(ip[0]);
        System.out.println(log.substring(0,log.indexOf(" ")));
        System.out.println(log.substring(log.indexOf("["), log.indexOf("]")+1));
        System.out.println(ip[3]);
        String time = ip[3].replace("[", "");
        System.out.println(time);
    }
}
