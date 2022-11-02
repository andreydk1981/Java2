package Lesson_1_HW3;

public class Hw3App {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasya", 100, 10);
        Human human = new Human("Andrey", 200, 20);
        Robot robot = new Robot("R2D2", 300, 30);
        Obstacle wall_10 = new Wall(10);
        Obstacle wall_20 = new Wall(20);
        Obstacle wall_30 = new Wall(30);
        Obstacle treadmill_100 = new Treadmill(100);
        Obstacle treadmill_200 = new Treadmill(200);
        Obstacle treadmill_250 = new Treadmill(250);
        Obstacle treadmill_300 = new Treadmill(300);

        Passers[] passers = new Passers[]{cat, human, robot};
        Obstacle[] obstacles = new Obstacle[]{wall_10, treadmill_100, treadmill_200, treadmill_250, wall_30, treadmill_300, wall_20};


        // START //
        for (Obstacle obstacle : obstacles) {
            System.out.println("----------------" + obstacle.info());
            for (Passers passer : passers) {
                passer.getObstacle(obstacle);
            }
        }
    }
}
