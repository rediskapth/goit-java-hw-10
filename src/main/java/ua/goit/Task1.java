package ua.goit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("Ivan", "Peter", "Serhiy", "Mike", "Dylan");

        String result = input.stream()
                .filter(s -> input.indexOf(s) % 2 != 0)
                .map(s -> input.indexOf(s) + ". " + s)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
