import java.lang.Thread;
public class mini_project {
    private static final int RACE_DISTANCE = 100;
    private static volatile boolean raceFinished = false;
    static class Hare implements Runnable {
        @Override
        public void run() {
            System.out.println("Hare has started the race!");
            for (int i = 1; i <= RACE_DISTANCE; i++) {
                if (raceFinished) {
                    break;
                }

                System.out.println("Hare: " + i + " meters.");

                if (i == 60) {
                    System.out.println("Hare is taking a nap for 1 second...");
                    try {
                        Thread.sleep(1000);
                        System.out.println("Hare wakes up and continues the race.");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                
                if (i == RACE_DISTANCE) {
                    System.out.println("Hare has finished the race!");
                    if (!raceFinished) {
                        System.out.println("Hare wins the race! 🏆");
                        raceFinished = true;
                    }
                }
            }
        }
    }
    static class Tortoise implements Runnable {
        @Override
        public void run() {
            System.out.println("Tortoise has started the race!");
            for (int i = 1; i <= RACE_DISTANCE; i++) {
                if (raceFinished) {
                    break;
                }
                
                System.out.println("Tortoise: " + i + " meters.");
                if (i == RACE_DISTANCE) {
                    System.out.println("Tortoise has finished the race!");
                    if (!raceFinished) {
                        System.out.println("Tortoise wins the race! 🎉");
                        raceFinished = true;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Thread hareThread = new Thread(new Hare(), "Hare");
        Thread tortoiseThread = new Thread(new Tortoise(), "Tortoise");
        hareThread.setPriority(Thread.MAX_PRIORITY);
        tortoiseThread.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Starting the Hare and Tortoise Race!");
        hareThread.start();
        tortoiseThread.start();
    }
}