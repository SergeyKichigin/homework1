package java2.homework5;

public class Array {
    private static final Object mon1 = new Object();
    private static final Object mon2 = new Object();
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr1 = new float[size];
    static float[] arr2 = new float[size];
    static float[] a1 = new float[h];
    static float[] a2 = new float[h];

    public static void main(String[] args) throws InterruptedException {
        oneStream();
        for (int i = 0; i < arr2.length; i++) { arr2[i] = 1; }
        long b = System.currentTimeMillis();
        twoStream();
        Thread t1 = new Thread(() -> {
            oneThread();
        });
        Thread t2 = new Thread(() -> {
            twoThread();
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        twoStreamEnd();
        System.out.println("Execution time in two thread: " + (System.currentTimeMillis() - b));
    }

    static void oneStream() {
        for (int i = 0; i < arr1.length; i++) { arr1[i] = 1; }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr1.length; i++) { arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));}
        System.out.println("Execution time in one thread: " + (System.currentTimeMillis() - a));
    }

    static void twoStream() {
        System.arraycopy(arr2, 0, a1, 0, h);
        System.arraycopy(arr2, h, a2, 0, h);
    }

    static void twoStreamEnd() {
        System.arraycopy(a1, 0, arr2, 0, h);
        System.arraycopy(a2, 0, arr2, h, h);
    }

    static void oneThread() {
        synchronized (mon1)  {
            for (int i = 0; i < a1.length; i++) { a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));}
        }
    }

    static void twoThread() {
        synchronized (mon2)  {
            for (int i = 0; i < a2.length; i++) { a2[i] = (float)(a2[i] * Math.sin(0.2f + (i + h) / 5) * Math.cos(0.2f + (i + h) / 5) * Math.cos(0.4f + (i + h) / 2));}
        }
    }
}
