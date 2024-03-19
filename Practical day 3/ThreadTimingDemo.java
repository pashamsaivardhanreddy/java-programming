class Thread1 extends Thread {
    private long startTime;
    private long endTime;
    private long waitingTime;
    private long sleepingTime;

    @Override
    public void run() {
        startTime = System.currentTimeMillis();
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        endTime = System.currentTimeMillis();
        waitingTime = endTime - startTime - 2000; // Subtract the sleep time
        sleepingTime = 2000;
    }

    public long getWaitingTime() {
        return waitingTime;
    }

    public long getSleepingTime() {
        return sleepingTime;
    }
}

class Thread2 extends Thread {
    private long startTime;
    private long endTime;
    private long waitingTime;
    private long sleepingTime;

    @Override
    public void run() {
        startTime = System.currentTimeMillis();
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        endTime = System.currentTimeMillis();
        waitingTime = endTime - startTime - 3000; // Subtract the sleep time
        sleepingTime = 3000;
    }

    public long getWaitingTime() {
        return waitingTime;
    }

    public long getSleepingTime() {
        return sleepingTime;
    }
}

public class ThreadTimingDemo {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        // Start both threads
        thread1.start();
        thread2.start();

        // Join both threads to wait for their completion
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Compare waiting and sleeping times
        long waitingTime1 = thread1.getWaitingTime();
        long sleepingTime1 = thread1.getSleepingTime();
        long waitingTime2 = thread2.getWaitingTime();
        long sleepingTime2 = thread2.getSleepingTime();

        System.out.println("Thread 1: Waiting Time = " + waitingTime1 + "ms, Sleeping Time = " + sleepingTime1 + "ms");
        System.out.println("Thread 2: Waiting Time = " + waitingTime2 + "ms, Sleeping Time = " + sleepingTime2 + "ms");

        if (waitingTime1 + sleepingTime1 > waitingTime2 + sleepingTime2) {
            System.out.println("Thread 1 has longer waiting and sleeping time.");
        } else if (waitingTime2 + sleepingTime2 > waitingTime1 + sleepingTime1) {
            System.out.println("Thread 2 has longer waiting and sleeping time.");
        } else {
            System.out.println("Both threads have the same waiting and sleeping time.");
        }
    }
}
