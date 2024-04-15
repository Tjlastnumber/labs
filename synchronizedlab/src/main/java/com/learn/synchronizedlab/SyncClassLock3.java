package com.learn.synchronizedlab;

public class SyncClassLock3 implements Runnable {

    static SyncClassLock3 instance1 = new SyncClassLock3();
    static SyncClassLock3 instance2 = new SyncClassLock3();

    @Override
    public void run() {
        synchronized (SyncClassLock3.class) {
            System.out.println("Start Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("End Thread: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);

        t1.start();
        t2.start();
    }
}
