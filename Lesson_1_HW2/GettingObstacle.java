package Lesson_1_HW2;

public interface GettingObstacle extends Moving, PosiblNext{
    default void takeAnObstacle (Obstacle obstacle){
        if(obstacle instanceof Wall && posiblNext()) jump(obstacle);
        if(obstacle instanceof Treadmill && posiblNext()) run(obstacle);
    }
}
