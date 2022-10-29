package Lesson_1_HW;

public abstract class Person implements Moves, CanOvercome{
    private final String type;
    private final int runLength;
    private final int jumpHeight;
    private boolean fail;

    public Person (String type, int runLength, int jumpHeight) {
        this.type = type;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    public String getType() {
        return type;
    }

    public int getRunLength() {
        return runLength;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public boolean isFail() {
        return fail;
    }

    public void setFail(boolean fail) {
        this.fail = fail;
    }
}
