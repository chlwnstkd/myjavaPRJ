package beginner.chapter11;
class Car_4 {
    private String color;
    private int speed;
    public void upSpeed(int value) {
        speed = speed + value;
    }

    public void downSpeed(int value) {
        speed = speed - value;
    }

    public String getColor() {
        return color;
    }
    public int getSpeed() {
        return speed;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

public class Ex11_04 {
    public static void main(String[] args) {
        Car_4 myCar1 = new Car_4();
        myCar1.setColor("빨강");
        myCar1.setSpeed(0);

        myCar1.upSpeed(30);
        System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는" + myCar1.getSpeed() + "km입니다.");
    }
}
