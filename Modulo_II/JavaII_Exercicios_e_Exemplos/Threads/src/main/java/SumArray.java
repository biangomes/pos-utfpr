public class SumArray {
    private int sum;

    synchronized int sumArray(int nums[]) {     // sumArray eh sincronizado
        sum = 0;        // redefine sum

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);

            try {
                Thread.sleep(10);       // permite a alternancia de tarefas
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
        return sum;
    }
}
