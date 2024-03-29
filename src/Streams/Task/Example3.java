package Streams.Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Алиса", "Олександр", "Максим");

        List<String> filteredNames = names.stream()
                .filter(name -> name.length() <= 4)  // Промежуточный оператор
                .map(s -> s.toUpperCase())  // Промежуточный оператор
                .collect(Collectors.toList());  // Терминальный оператор

        System.out.println(filteredNames);

    }
}
