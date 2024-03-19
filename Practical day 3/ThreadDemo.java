class ArmstrongThread extends Thread {
    private int start, end;

    public ArmstrongThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("ArmstrongThread started...");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
        System.out.println("ArmstrongThread completed.");
    }

    private boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0, n = 0;
        originalNum = num;
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }
        originalNum = num;
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }
        return result == num;
    }
}

class FibonacciThread extends Thread {
    private int count;

    public FibonacciThread(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("FibonacciThread started...");
        int a = 0, b = 1;
        System.out.print("Fibonacci Series:");
        for (int i = 0; i < count; i++) {
            System.out.print(" " + a);
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
        System.out.println("FibonacciThread completed.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        ArmstrongThread armstrongThread = new ArmstrongThread(100, 1000);
        FibonacciThread fibonacciThread = new FibonacciThread(10);

        // Start both threads
        armstrongThread.start();
        fibonacciThread.start();

        // Join both threads to wait for their completion
        try {
            armstrongThread.join();
            fibonacciThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}
