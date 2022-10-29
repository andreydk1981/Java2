package Lesson_1_HW2;

public abstract class Person implements Moving, GetObstacle{
    private final String name;
    private final int jumpHeight;
    private final int runLength;

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
}
