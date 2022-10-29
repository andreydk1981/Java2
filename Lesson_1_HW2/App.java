package Lesson_1_HW2;

public class App {
    public static void main(String[] args) {
        Person cat1 = new Cat("Cat-1", 5, 10);
        Person cat2 = new Cat("Cat-2", 6, 20);
        Person cat3 = new Cat("Cat-3", 7, 30);
        Obstacle wall_5 = new Wall(5);
        Obstacle wall_6 = new Wall(6);
        Obstacle wall_7 = new Wall(7);
        Obstacle treadmill_10 = new Treadmill(10);
        Obstacle treadmill_20 = new Treadmill(20);
        Obstacle treadmill_30 = new Treadmill(30);

        Moving[] movings = new Moving[] {cat1, cat2, cat3};
        Obstacle[] obstacles = new Obstacle[]{wall_5,treadmill_10,wall_6,treadmill_20,wall_7,treadmill_30};

        for (Obstacle obstacle: obstacles){
            for (Moving moving: movings){

            }
        }
    }
}
