class NumberThread extends Thread {
    private final int sleepTime;

    public NumberThread(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) { // Generate numbers from 1 to 10
            System.out.println("Thread " + getId() + ": " + i);
            if (i % 2 == 0) { // Check if the number is even
                synchronized (this) {
                    notifyAll(); // Notify waiting threads
                }
                try {
                    Thread.sleep(sleepTime); // Sleep for the specified time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class JoinSleepThreads {
    public static void main(String[] args) {
        NumberThread thread1 = new NumberThread(10000); // Sleep time for T1: 10000ms
        NumberThread thread2 = new NumberThread(5000); // Sleep time for T2: 5000ms

        thread1.start();
        thread2.start();

        try {
            synchronized (thread1) {
                thread1.wait(); // Wait for even number in T1
            }
            synchronized (thread2) {
                thread2.wait(); // Wait for even number in T2
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }
}
