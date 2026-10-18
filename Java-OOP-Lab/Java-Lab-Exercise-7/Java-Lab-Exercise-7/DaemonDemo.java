// Aim: To demonstrate a daemon thread in Java.

class BackgroundTask extends Thread {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Daemon thread is running.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class DaemonDemo {
    public static void main(String[] args) {
        BackgroundTask daemon = new BackgroundTask();
        daemon.setDaemon(true);
        daemon.start();

        System.out.println("Main thread is finishing.");
    }
}
