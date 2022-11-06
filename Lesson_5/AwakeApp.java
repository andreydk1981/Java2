package Lesson_5;

public class AwakeApp {
    public static void main(String[] args) throws InterruptedException {
        var ref = new Object() {
            volatile boolean isRun = true;
        };
        Thread thread = new Thread(() -> {
            while (ref.isRun){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("tik");
            }
            System.out.println(Thread.currentThread().getName()+" "+"Interrupted");
        });

        thread.start();
        Thread.sleep(5000);
        ref.isRun = false;
    }
}
