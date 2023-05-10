package beginner.chapter11;
class Car_7 {
private String color;
private int speed;

        Car_7(String color, int speed) {
        this.color = color;
        this.speed = speed;
        }

public String getColor() {
        return this.color;
        }
public int getSpeed() {
        return this.speed;
        }
        }
public class Ex11_07 {
    public static void main(String[] args) {
        Car_7 myCar1 = new Car_7("빨강",0);
        Car_7 myCar2 = new Car_7("파랑",30);

        System.out.println("자동차1의 색상은 " + myCar1.getColor()
                + "이며, 현재속도는" + myCar1.getSpeed() + "km입니다.");
        System.out.println("자동차1의 색상은 " + myCar1.getColor()
                + "이며, 현재속도는" + myCar2.getSpeed() + "km입니다.");
    }
}
