package Lesson_1_HW;

public interface CanOvercome {
    default boolean checkObstacleLength(Obstacle obstacle, Person person) {
        if (obstacle.getLength() <= person.getRunLength()) {
            return true;
        } else return false;
    }

    default boolean checkObstacleHeigh(Obstacle obstacle, Person person) {
        if (obstacle.getHeight() <= person.getJumpHeight()) {
            return true;
        } else return false;
    }
}
