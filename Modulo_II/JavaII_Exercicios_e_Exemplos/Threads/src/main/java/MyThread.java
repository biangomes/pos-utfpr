// Cria uma classe implementando Runnable
public class MyThread implements Runnable {
    Thread thread;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    public MyThread(String threadName) {
        thread = new Thread(this, threadName);
        thread.start();     // inicia a thread
    }

    public MyThread(String threadName, int nums[]) {
        thread = new Thread(this, threadName);
        a = nums;
        thread.start();     // inicia a thread
    }

    // Começa a execucao da nova thread
    public void run() {     // a execucao comeca aqui
        int sum;
        System.out.println(thread.getName() + " starting");
        answer = sa.sumArray(a);
        System.out.println("Sum for " + thread.getName() + " is " + answer);
        System.out.println(thread.getName() + " terminating");
    }
}
