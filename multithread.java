public class MultiThreadDemo {

    public static void main(String[] args) {

        // Thread for displaying "BMS College of Engineering" every 10 seconds
        Thread thread1 = new Thread(() -> {
            while (true) {
                System.out.println("BMS College of Engineering");
                try {
                    Thread.sleep(10000); // Sleep for 10 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread for displaying "CSE" every 2 seconds
        Thread thread2 = new Thread(() -> {
            while (true) {
                System.out.println("CSE");
                try {
                    Thread.sleep(2000); // Sleep for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
