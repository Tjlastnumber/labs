package com.learn.synchronizedlab;

public class SyncJVM {
    Object o = new Object();
    public void method() {
        synchronized (o) {

        }

        method2();
    }

    private static void method2() {
    }
}
