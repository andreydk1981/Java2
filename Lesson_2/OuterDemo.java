package Lesson_2;

public class OuterDemo {
    Car.Builder builder= new Car.Builder();

    Car car = builder.setColor("red").setPower(100).build();
    Car car2 = new Car.Builder().build();
}
