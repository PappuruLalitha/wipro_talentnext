class EvenNumberThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}
class OddNumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}
public class threadControl2 {
    public static void main(String[] args) throws InterruptedException {
        EvenNumberThread evenThread = new EvenNumberThread();
        OddNumberThread oddThread = new OddNumberThread();
        evenThread.start();        
        evenThread.join(); 

        oddThread.start();
    }
}