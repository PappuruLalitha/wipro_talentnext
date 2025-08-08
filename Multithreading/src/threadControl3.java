class PriorityThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " running with priority " + Thread.currentThread().getPriority());
        }
    }
}
public class threadControl3 {
    public static void main(String[] args) {
        PriorityThread maxPriorityThread = new PriorityThread();
        maxPriorityThread.setName("MaxPriorityThread");
        maxPriorityThread.setPriority(Thread.MAX_PRIORITY);

        PriorityThread normPriorityThread = new PriorityThread();
        normPriorityThread.setName("NormPriorityThread");
        normPriorityThread.setPriority(Thread.NORM_PRIORITY);

        PriorityThread minPriorityThread = new PriorityThread();
        minPriorityThread.setName("MinPriorityThread");
        minPriorityThread.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Starting threads with different priorities...");
        maxPriorityThread.start();
        normPriorityThread.start();
        minPriorityThread.start();
    }
}