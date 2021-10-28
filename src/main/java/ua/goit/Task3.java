package ua.goit;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {

        String[] str = {"1, 2, 0", "4, 5"};

        String result = Arrays.stream(str)
                .flatMap(s -> Arrays.stream(s.split(",\\s+")))
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
