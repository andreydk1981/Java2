package Lesson_1_HW3;

public interface Passers extends Movable{
    default boolean getObstacle(Obstacle obstacle){
        switch (obstacle.getType(obstacle)){
            case WALL -> {
                return jump((Wall)obstacle);
            }
            case TREADMILL -> {
                return run((Treadmill)obstacle);
            } default -> {
                throw new IllegalArgumentException("Unknown Obstacle");
            }
        }
    }

}
