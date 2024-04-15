package com.learn.synchronizedlab;


/**
 * 对象锁1
 */
public class SyncObjectLock implements Runnable {

    int i = 0;
    static SyncObjectLock instance = new SyncObjectLock();

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Start Thread: " + Thread.currentThread().getName());
            System.out.println("i: " + i);
            try {
                i++;
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i: " + i);
            System.out.println("End Thread: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);

        t1.start();
        t2.start();
    }
}
