package beginner.chapter11;
class Car_8 {
    private String color;
    private int speed;

    Car_8() {
        }
        Car_8(String color) {
        this.color = color;
        }
        Car_8(String color, int speed) {
            this.color = color;
            this.speed = speed;
        }


    public String getColor() {
        return color;
    }
    public int getSpeed() {
        return speed;
    }
}
public class Ex11_08 {
    public static void main(String[] args) {

    Car_8 myCar1 = new Car_8();
    Car_8 myCar2 = new Car_8("빨강");
    Car_8 myCar3 = new Car_8("파랑", 30);

    System.out.println("자동차1의 색상은 "+myCar1.getColor()+"이며, 현재속도는"+myCar1.getSpeed()+"km입니다.");
    System.out.println("자동차1의 색상은 "+myCar2.getColor()+"이며, 현재속도는"+myCar2.getSpeed()+"km입니다.");
    System.out.println("자동차1의 색상은 "+myCar3.getColor()+"이며, 현재속도는"+myCar3.getSpeed()+"km입니다.");
}
}
