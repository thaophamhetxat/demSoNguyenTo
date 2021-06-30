package com.codegym;

import java.io.IOException;

public class SoNguyenTo implements Runnable {
    private Thread myThread;
    private final String threadName;

    public SoNguyenTo(String name) {
        threadName = name;
    }

    @Override
    public void run() {

    }

    public void start() {
        System.out.println("start " + myThread);
        if (myThread == null) {
            myThread = new Thread(this, threadName);
            myThread.start();
        }
    }
}
