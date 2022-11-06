package Lesson_5;

public class WaitApp {
    private final Object lock = new Object();
    String current = "A";

    public static void main(String[] args) {

        WaitApp printApp = new WaitApp();
        Thread thread1 = new Thread(printApp::printA);
        Thread thread2 = new Thread(printApp::printB);

        thread1.start();
        thread2.start();
    }

    public void printA() {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                while (!current.equals("A")){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print("A");
                current = "B";
                lock.notify();
            }
        }
    }

    public void printB() {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                while (!current.equals("B")){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print("B");
                current = "A";
                lock.notify();
            }
        }
    }

}
