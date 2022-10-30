package Lesson_2.exceptions;

public class ExceptionApp {
    public static void main(String[] args) {
        int c = div(10, 0);
        System.out.println(c);
        try {
            exc(10, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static int div(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException exception) {
            System.out.println("Handle " + exception.getMessage());
            exception.printStackTrace(System.out);
            return 0;
        }
    }

    static void exc (int a, int b) throws Exception {
        throw new MyCheckedException("Unimplemented");
    }

    public static void readfile() {
        try {

        } catch (Exception ex) {

        } finally {

        }

    }

}
