void main() {
    Scanner scanner = new Scanner(System.in);
    IO.println("Insert list of real numbers");
    String firstStringList = scanner.nextLine().trim();
    IO.println("Insert list of real numbers");
    String secondStringList = scanner.nextLine().trim();
    scanner.close();

    double[] firstDoubleArray = parseDoubleArray(firstStringList);
    double[] secondDoubleArray = parseDoubleArray(secondStringList);

    MultisetOfReals x1 = new MultisetOfReals(firstDoubleArray);
    MultisetOfReals x2 = new MultisetOfReals(secondDoubleArray);

    if (x1.equals(x2)) {
        IO.println(x1 + " is the same as " + x2);
    } else {
        IO.println(x1 + " is NOT the same as " + x2);
    }
}

double[] parseDoubleArray(String input) {
    if (input.isEmpty()) {
        return new double[0];
    }
    String[] parts = input.split(",");
    double[] result = new double[parts.length];
    for (int i = 0; i < parts.length; i++) {
        result[i] = Double.parseDouble(parts[i].trim());
    }
    return result;
}