package Lesson_5_HW;

public class App_5_HW {
    static final int length = 10000000;
    static final int h = length/2;

    public static void main(String[] args) throws InterruptedException {
        float [] arr = new float[length];
        for (int i = 0; i < length; i++) {
            arr[i] = 1;
        }
        arrayMath1(arr);
        arrayMath2(arr);

    }

    static void arrayMath1 (float[]arr){

        long a = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);

    }
    static void arrayMath2 (float[]arr) throws InterruptedException {
        float[]a1 = new float[h];
        float[]a2 = new float[h];
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.arraycopy(arr,0,a1,0,h);
                for (int i = 0; i < h; i++) {
                    a1[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.arraycopy(a1,0,arr,0,h);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.arraycopy(arr,h,a2,0,h);
                for (int i = 0; i < h; i++) {
                    a2[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.arraycopy(a2,0,arr,h,h);
            }
        });

        long a = System.currentTimeMillis();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(System.currentTimeMillis() - a);


    }
}
