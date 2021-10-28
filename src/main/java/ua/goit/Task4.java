package ua.goit;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {

    private static final long A = 25214903917L;
    private static final long C = 11;
    private static final long M = (long) Math.pow(2, 48);

    public static void main(String[] args) {

        long seed = 10L;

        System.out.println(generator(A, C, M, seed).limit(5).collect(Collectors.toList()));
    }

    public static Stream<Long> generator(long A, long C, long M, long seed) {
        return Stream.iterate(seed, n -> (A * n + C) % M);
    }
}
