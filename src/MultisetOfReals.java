import java.util.Arrays;

public class MultisetOfReals {

    private final double[] orderedElements;

    public MultisetOfReals(double[] numbers) {
        Arrays.sort(numbers);
        this.orderedElements = numbers;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (!(other instanceof MultisetOfReals)) {
            return false;
        }
        return Arrays.equals(orderedElements, ((MultisetOfReals) other).orderedElements);
    }

    @Override
    public String toString() {
        return Arrays.toString(orderedElements);
    }
}