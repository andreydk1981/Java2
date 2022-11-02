package Lesson_3_HW;

public class NumberAlredyTakenExeption extends RuntimeException {
    public NumberAlredyTakenExeption(String message) {
        super(message);
    }
}
