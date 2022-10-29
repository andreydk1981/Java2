package Lesson_1_HW;

public abstract class Obstacle {
    private final int parameter;

    public Obstacle(int num) {
        this.parameter = num;
    }


    public int getLength() {
        return parameter;
    }

    public int getHeight() {
        return parameter;
    }
}
