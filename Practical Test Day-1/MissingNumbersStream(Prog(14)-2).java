import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumbersStream {

    public static void main(String[] args) {
        int[] series = {1, 5, 11, 19};

        int difference = series[1] - series[0];

        IntStream missingNumbers = IntStream.iterate(series[0] + difference, n -> n + difference)
                .limit(series.length)
                .filter(n -> !Arrays.stream(series).anyMatch(x -> x == n));

        missingNumbers.forEach(System.out::println);
    }
}
