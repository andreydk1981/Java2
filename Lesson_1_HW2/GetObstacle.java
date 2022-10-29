package Lesson_1_HW2;

public interface GetObstacle {
    default boolean getObstacle(Obstacle obstacle){
        return true;
    }
}
