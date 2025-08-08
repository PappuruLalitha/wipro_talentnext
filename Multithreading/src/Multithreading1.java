public class Multithreading1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread running: " + Thread.currentThread().getName());
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Thread running: " + Thread.currentThread().getName());
        });
        t1.setName("Scooby");
        t2.setName("Shaggy");
        t1.start();
        t2.start();
    }
}
