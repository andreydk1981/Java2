package Lesson_5;

public class MyApp5 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new MyRunnable());
        Thread thread2 = new MyThread();
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        thread.setDaemon(true);
        thread.start();
        thread2.start();
        thread3.start();

        System.out.println("Main END");
    }

    public static class MyRunnable implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }

    private static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}
