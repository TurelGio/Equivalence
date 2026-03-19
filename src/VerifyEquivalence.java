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

void main() {
    Scanner scanner = new Scanner(System.in);
    IO.println("Insert list of real numbers");
    String firstStringList = scanner.nextLine();
    IO.println("Insert list of real numbers");
    String secondStringList = scanner.nextLine();
    scanner.close();

    String[] firstStringArray;
    String[] secondStringArray;

    if (firstStringList.isEmpty()) {
        firstStringArray = new String[]{""};
    } else {
        firstStringArray = firstStringList.split(",");
    }
    if (secondStringList.isEmpty()) {
        secondStringArray = new String[]{""};
    } else {
        secondStringArray = secondStringList.split(",");
    }

    double[] firstDoubleArray = new double[firstStringArray.length];
    double[] secondDoubleArray = new double[secondStringArray.length];
    if (firstStringList.isEmpty()) {
        firstDoubleArray[0] = 0;
    } else {
        for (int i = 0; i < firstDoubleArray.length; i++) {
            firstDoubleArray[i] = Double.parseDouble(firstStringArray[i]);
        }
    }
    if (secondStringList.isEmpty()) {
        secondDoubleArray[0] = 0;
    } else {
        for (int i = 0; i < secondDoubleArray.length; i++) {
            secondDoubleArray[i] = Double.parseDouble(secondStringArray[i]);
        }
    }

    MultisetOfReals x1 = new MultisetOfReals(firstDoubleArray);
    MultisetOfReals x2 = new MultisetOfReals(secondDoubleArray);

    if (x1.equals(x2)) {
        IO.println(x1 + " is the same as " + x2);
    } else {
        IO.println(x1 + " is NOT the same as " + x2);
    }
}