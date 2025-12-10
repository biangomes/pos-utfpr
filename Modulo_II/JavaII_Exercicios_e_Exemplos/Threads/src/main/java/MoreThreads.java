public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting");

        MyThread mt1 = new MyThread("Child #01");
        MyThread mt2 = new MyThread("Child #02");
        MyThread mt3 = new MyThread("Child #03");

        do {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        } while (mt1.thread.isAlive() || mt2.thread.isAlive() || mt3.thread.isAlive());

        System.out.println("Main thread ending");
    }
}
