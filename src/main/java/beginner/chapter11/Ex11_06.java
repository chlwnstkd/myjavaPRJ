package beginner.chapter11;
class Car_6 {
    private String color;
    private int speed;

    Car_6() {
        color = "빨강";
        speed = 0;
    }

    public String getColor() {
        return color;
    }
    public int getSpeed() {
        return speed;
    }
}
public class Ex11_06 {
    public static void main(String[] args) {
        Car_6 myCar1 = new Car_6();
        Car_6 myCar2 = new Car_6();

        System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는" + myCar1.getSpeed() + "km입니다.");
        System.out.println("자동차1의 색상은 " + myCar2.getColor() + "이며, 현재속도는" + myCar2.getSpeed() + "km입니다.");
    }

}
