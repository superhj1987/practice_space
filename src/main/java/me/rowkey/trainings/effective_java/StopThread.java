package me.rowkey.trainings.effective_java;

import java.util.concurrent.TimeUnit;

public class StopThread {
    private static boolean stopRequested;

    /**
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread() {
            public void run() {
                int i = 0;
                while (!stopRequested) {
                    i++;
                    System.out.println(i);
                }
            }
        };

        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }

}
