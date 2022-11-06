package Lesson_5;

public class RaceApp {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Object lock = new Object();
        Object lock2 = new Object();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (lock) {
                    synchronized (lock2) {
                        counter.increment();
                    }
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (lock) {
                    synchronized (lock2) {
                        counter.increment();
                    }
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.getCount());
    }

    private static class Counter {
        private int count = 0;

        public int getCount() {
            return count;
        }

        public void increment() {
            count++;
        }

        public void decrement() {
            count--;
        }
    }


}
