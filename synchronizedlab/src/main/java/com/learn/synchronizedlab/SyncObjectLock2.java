package com.learn.synchronizedlab;

import java.lang.reflect.Array;
import java.util.stream.Collectors;

/**
 * 对象锁2
 */
public class SyncObjectLock2 implements Runnable {
    static SyncObjectLock2 instance = new SyncObjectLock2();

    Object o1 = new Object();
//    Object o2 = new Object();

    @Override
    public void run() {
        String[] a = {"1", "2", "3"};
        String[] b = {"a", "b", "c"};

        synchronized (o1) {
            System.out.println("o1 lock, Start Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("o1 lock, End Thread: " + Thread.currentThread().getName());
        }

        synchronized (o1) {
            System.out.println("o2 lock, Start Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("o2 lock, End Thread: " + Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);

        t1.start();
        t2.start();
    }
}
