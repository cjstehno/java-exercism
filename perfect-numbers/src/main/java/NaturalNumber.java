public class NaturalNumber {

    private final Classification classification;

    public NaturalNumber(final int value) {
        if (value < 1) throw new IllegalArgumentException("You must supply a natural number (positive integer)");

        final int aliquotSum = aliquot(value);

        if (aliquotSum == value) {
            classification = Classification.PERFECT;
        } else if (aliquotSum > value) {
            classification = Classification.ABUNDANT;
        } else {
            classification = Classification.DEFICIENT;
        }
    }

    public Classification getClassification() {
        return classification;
    }

    private static int aliquot(final int number) {
        int sum = 0;
        for (int n = 1; n < number; n++) {
            if (number % n == 0) {
                sum += n;
            }
        }
        return sum;
    }
}
