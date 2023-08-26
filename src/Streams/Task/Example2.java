package Streams.Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example2 {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    Stream<Integer> stream = numbers.stream();


    String[] names = {"Alice", "Bob", "Charlie"};
    Stream<String> streamFromArray = Arrays.stream(names);


    Stream<String> streamFromValues = Stream.of("apple", "banana", "cherry");

    Stream<Object> streamEmpty = Stream.empty();



}
