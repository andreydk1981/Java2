package Lesson_1_HW2;

public abstract class Person implements Moving, GettingObstacle, PosiblNext {
    private final String name;
    private final int jumpHeight;
    private final int runLength;
    private boolean isFail = false;

    public Person(String name, int jumpHeight, int runLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRunLength() {
        return runLength;
    }

    @Override
    public void run(Obstacle obstacle) {
        if (this.runLength >= obstacle.getParam()){
            System.out.println(String.format("%s run %d meters",this.name, obstacle.getParam()));
        } else {
            System.out.println(String.format("%s Can't run %d meters", this.name, obstacle.getParam()));
            this.isFail = true;
        }
    }

    @Override
    public void jump(Obstacle obstacle) {
        if (this.jumpHeight >= obstacle.getParam()){
            System.out.println(String.format("%s jump %d meters",this.name, obstacle.getParam()));
        } else {
            System.out.println(String.format("%s Can't jump %d meters",this.name, obstacle.getParam()));
            this.isFail = true;
        }
    }

    @Override
    public boolean posiblNext() {
        if (this.isFail) return false;
        else return true;
    }
}
