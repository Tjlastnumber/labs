package com.learn.synchronizedlab;

public class SyncClassLock2 implements Runnable {
    static SyncClassLock2 instance1 = new SyncClassLock2();
    static SyncClassLock2 instance2 = new SyncClassLock2();

    @Override
    public void run() {
        method();
    }

    /**
     * 等同于this锁
     */
    private static synchronized void method() {
        System.out.println("Start Thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End Thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);

        t1.start();
        t2.start();
    }
}
