package com.learn.synchronizedlab;

/**
 * 方法锁
 */
public class SyncMethodLock implements Runnable {

    static SyncMethodLock instance = new SyncMethodLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        method();
    }

    /**
     * 等同于this锁
     */
    private synchronized void method() {
        System.out.println("Start Thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End Thread: " + Thread.currentThread().getName());
    }
}
