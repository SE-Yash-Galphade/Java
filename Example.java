package com.google.yash;


class MyThread extends Thread {
    private int threadId;
    private int iterations;

    public MyThread(int threadId, int iterations) {
        this.threadId = threadId;
        this.iterations = iterations;
    }

    @Override
    public void run() {
        for (int i = 0; i < iterations; i++) {
            System.out.println("Thread " + threadId + ": " + i);
            // Simulate some work
            try {
                Thread.sleep(100); // removed try-catch block
            }
            finally {
            	
            
            // removed catch block
        }
        System.out.println("Thread " + threadId + " finished");
    }
}

public class Example {
    public static void main(String[] args) {
        // Create 5 threads with different IDs and iterations
        MyThread thread1 = new MyThread(1, 5);
        MyThread thread2 = new MyThread(2, 3);
        MyThread thread3 = new MyThread(3, 7);
        MyThread thread4 = new MyThread(4, 2);
        MyThread thread5 = new MyThread(5, 4);

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}