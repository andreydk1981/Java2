package Lesson_1_HW2;

public abstract class Obstacle {
    private final int param;

    public Obstacle(int param) {
        this.param = param;
    }

    public int getParam() {
        return param;
    }
}
