package exercises.fibonacchi;

public class IterativeFibonacci implements FibonacciStrategy {

    @Override
    public long compute(int n) {
        if (n ==0) return 1;
        if (n ==1) return 1;
        long beforePrev =1;
        long prev =1;
        long current =0;
        for (int i =2 ; i <= n; i++) {
            current = beforePrev + prev;
            beforePrev = prev;
            prev = current;

        }
        return current;
    }


    public static void main(String[] args) {
        IterativeFibonacci fibonacci = new IterativeFibonacci();
        int N = 50; // can go high safely — runs fast even for large N

        System.out.printf("%-10s |%-20s |%-20s|%n", "n", "Fibonacci(n)", "Time (ms)");

        long totalStart = System.currentTimeMillis();

        for (int i = 0; i <= N; i++) {
            long start = System.currentTimeMillis();
            long value = fibonacci.compute(i);
            long end = System.currentTimeMillis();

            long elapsed = end - start;
            System.out.printf("%-10d |%-20d |%-20d|%n", i, value, elapsed);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        long totalEnd = System.currentTimeMillis();
        System.out.println("\nTotal elapsed time: " + (totalEnd - totalStart) + " ms");
    }
}
