package Lesson_1_HW3;

public interface Movable {
    default boolean run(Treadmill treadmill) {
        System.out.println("Default run");
        return true;
    }

    default boolean jump(Wall wall) {
        System.out.println("Default jump");
        return true;
    }
}
