public class PriorityDemo {
    public static void main(String[] args) {
        Priority mt1 = new Priority("High priority");
        Priority mt2 = new Priority("Low priority");

        // Define as prioridades
        mt1.thread.setPriority(Thread.NORM_PRIORITY+2);
        mt1.thread.setPriority(Thread.NORM_PRIORITY-2);

        // Inicia as threads
        mt1.thread.start();
        mt2.thread.start();

        try {
            mt1.thread.join();
            mt2.thread.join();
        } catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("\nHigh priority thread counted to " + mt1.count);
        System.out.println("\nLow priority thread counted to " + mt2.count);
    }
}
