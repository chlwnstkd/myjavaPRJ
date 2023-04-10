package beginner.chapter11;
class Calc_2 {
    void addValue (double v1, double v2) {
        System.out.println("doublie값 계산 ==> " + (v1 + v2));
    }
    void addValue (int v1, int v2) {
        System.out.println("int값 계산 ==> " + (v1 + v2));
    }
}
public class Ex11_09 {
    public static void main(String[] args) {
        Calc_2 myCalc = new Calc_2();

        myCalc.addValue(1.0,1.0);
        myCalc.addValue(1, 1);
    }

}
