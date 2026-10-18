// Aim: To demonstrate the isAlive() and join() methods in Java threads.

class WorkerThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Worker thread: " + i);
        }
    }
}

public class AliveJoinDemo {
    public static void main(String[] args) {
        WorkerThread worker = new WorkerThread();

        System.out.println("Before start, isAlive: " + worker.isAlive());
        worker.start();
        System.out.println("After start, isAlive: " + worker.isAlive());

        try {
            worker.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("After join, isAlive: " + worker.isAlive());
        System.out.println("Main thread continues.");
    }
}
