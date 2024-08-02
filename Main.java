package com.google.yash;


class multi extends Thread {
    private int threadId;
    private int iterations;

    public multi(int threadId, int iterations) {
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

public class Main {
    public static void main(String[] args) {
        // Create 5 threads with different IDs and iterations
    	multi thread1 = new multi(1, 5);
    	multi thread2 = new multi(2, 3);
        

        // Start all threads
        thread1.start();
        thread2.start();
       
    }
}
}
