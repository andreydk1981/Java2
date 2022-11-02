package Lesson_1_HW3;

public class Wall extends Obstacle {
    private final int high;

    public Wall(int high) {
        this.high = high;
    }

    public int getHigh() {
        return high;
    }

    @Override
    Obstacles getType(Obstacle obstacle) {
        return Obstacles.WALL;
    }

    @Override
    String info() {
        return getType(this) + " " + this.high;
    }


}
