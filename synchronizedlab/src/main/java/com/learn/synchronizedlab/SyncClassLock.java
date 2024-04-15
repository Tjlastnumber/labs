package com.learn.synchronizedlab;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 类锁
 */
public class SyncClassLock implements Runnable {
    final static AtomicInteger i = new AtomicInteger(0);

    static SyncClassLock instance1 = new SyncClassLock();
    static SyncClassLock instance2 = new SyncClassLock();

    @Override
    public void run() {
        method();
    }

    /**
     * 等同于this锁
     */
    private void method() {
        System.out.println("Start Thread: " + Thread.currentThread().getName() + ", i:" + i);
        try {
            i.addAndGet(1);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End Thread: " + Thread.currentThread().getName() + ", i:" + i);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t11 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        Thread t21 = new Thread(instance2);

        t1.start();
        t11.start();
        t2.start();
        t21.start();
    }
}
