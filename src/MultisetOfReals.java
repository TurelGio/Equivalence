/*
    ASSIGNMENT 1

    Design and implement a class that represent X = M(R)
    - with a proper equals().
    - with a proper toString().
    - with a proper constructor that takes 0+ values in R.

    ASSIGNMENT 2

    Write an application that reads from stdin two comma-separated lists of real numbers,
    create x1, x2 in X and outputs a text message saying if x1,x2 are the same or not.
    - user gives two separated inputs.
    - comma separated values within each input.
 */

import java.util.Arrays;

public class MultisetOfReals {

    private final double[] orderedElements;

    public MultisetOfReals(double[] numbers) {
        Arrays.sort(numbers);
        this.orderedElements = numbers;
    }

    @Override
    public boolean equals(Object other) {
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