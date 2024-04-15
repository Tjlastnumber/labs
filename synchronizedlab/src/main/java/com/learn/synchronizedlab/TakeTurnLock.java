package com.learn.synchronizedlab;

public class TakeTurnLock {
    static Object o = new Object();

    static Task1 task1 = new Task1();
    static Task2 task2 = new Task2();

    public static void main(String[] args) {
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }

    static class Task1 implements Runnable {

        static String[] s = {"1", "2", "3"};

        @Override
        public void run() {
            synchronized (o) {
                int c = 0;
                while (c < s.length) {
                    try {
                        System.out.println(Thread.currentThread().getName() + ":" + s[c++]);
                        o.notify();
                        if (c < s.length) {
                            o.wait();
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    static class Task2 implements Runnable {

        static String[] s = {"a", "b", "c"};

        @Override
        public void run() {
            synchronized (o) {
                int c = 0;
                while (c < s.length) {
                    try {
                        System.out.println(Thread.currentThread().getName() + ":" + s[c++]);
                        o.notify();
                        if (c < s.length) {
                            o.wait();
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

}
