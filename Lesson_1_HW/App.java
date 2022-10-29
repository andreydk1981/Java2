package Lesson_1_HW;

public class App {
    public static void main(String[] args) {
        Person cat = new Cat("Cat", 10, 5);
        Person human = new Human("Human", 20, 6);
        Person robot = new Robot("Robot", 30, 7);
        Obstacle treadmill10 = new Treadmill(10);
        Obstacle treadmill20 = new Treadmill(20);
        Obstacle treadmill30 = new Treadmill(30);
        Obstacle wall5 = new Wall(5);
        Obstacle wall6 = new Wall(6);
        Obstacle wall7 = new Wall(7);

        Person[] persons = new Person[]{cat, human, robot};
        Obstacle[] obstacles = new Obstacle[]{wall5, treadmill10, wall6, treadmill20, wall7, treadmill30};
        for (Obstacle obstacle : obstacles) {
            if (obstacle instanceof Wall) System.out.println("------ Wall " + obstacle.getHeight());
            if (obstacle instanceof Treadmill) System.out.println("------ Treadmill " + obstacle.getLength());
            for (Person person : persons) {
                person.getObstacle(obstacle, person);
            }
        }

    }
}

