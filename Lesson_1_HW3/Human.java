package Lesson_1_HW3;

public class Human implements Passers{
    private final String name;
    private final int runLimit;
    private final int jumpLimit;
    private boolean isLost = false;

    public Human(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public boolean isLost() {
        return isLost;
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (!isLost) {
            if (treadmill.getLength() <= this.runLimit) {
                System.out.println(name + " run " + treadmill.getLength());
                return true;
            } else {
                System.out.println(name + " is lost");
                this.isLost = true;
                return false;
            }
        }
        return false;
    }
    @Override
    public boolean jump(Wall wall) {
        if (!isLost) {
            if (wall.getHigh() <= this.jumpLimit) {
                System.out.println(name + " jump " + wall.getHigh());
                return true;
            } else {
                System.out.println(name + " is lost");
                this.isLost = true;
                return false;
            }
        }
        return false;
    }
}
