package Lesson_1_HW3;

public class Treadmill extends Obstacle{
    @Override
    Obstacles getType(Obstacle obstacle) {
        return Obstacles.TREADMILL;
    }

    @Override
    String info() {
        return getType(this) + " " + this.length;
    }

    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
