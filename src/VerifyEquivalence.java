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

    MultisetOfReals firstMultiset = new MultisetOfReals(firstDoubleArray);
    MultisetOfReals secondMultiset = new MultisetOfReals(secondDoubleArray);

    if (firstMultiset.equals(secondMultiset)) {
        IO.println(firstMultiset + " is the same as " + secondMultiset);
    } else {
        IO.println(firstMultiset + " is NOT the same as " + secondMultiset);
    }
}