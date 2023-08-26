package Threads.Task;

import java.util.*;
import java.util.concurrent.*;

public class Task3 {
    private static Set<Integer> numbers = new HashSet<>();
    private static Set<Integer> synchroNumbers = Collections.synchronizedSet(numbers);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            for (int i = 1; i <= 10000; i++) {
                synchroNumbers.add(i);
                System.out.println("Поток 1 добавил элемент: " + i);
            }
        };

        Runnable task2 = () -> {
            for (int i = 10001; i <= 20000; i++) {
                synchroNumbers.add(i);
                System.out.println("Поток 2 добавил элемент: " + i);
            }
        };

        executorService.submit(task1);
        executorService.submit(task2);

        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("Размер коллекции: " + synchroNumbers.size());
        System.out.println(synchroNumbers.toString());
    }
}