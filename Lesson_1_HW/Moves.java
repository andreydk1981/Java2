package Lesson_1_HW;

public interface Moves {

    default  void getObstacle(Obstacle obstacle, Person person) {
        if (obstacle instanceof Treadmill && !person.isFail()) {
            if (person.checkObstacleLength(obstacle, person)) {
                System.out.printf("%s run %d\n", person.getType(), obstacle.getLength());
            } else {
                System.out.printf("%s CAN'T run %d\n", person.getType(), obstacle.getLength());
                person.setFail(true);
            }
        }
        if (obstacle instanceof Wall && !person.isFail()) {
            if (person.checkObstacleHeigh(obstacle, person)) {
                System.out.printf("%s jump %d\n", person.getType(), obstacle.getLength());
            }
            else {
                System.out.printf("%s CAN'T jump %d\n", person.getType(), obstacle.getLength());
                person.setFail(true);
            }
        }
    }
}
