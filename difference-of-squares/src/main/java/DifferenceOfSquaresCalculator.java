public class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(final int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum * sum;
    }

    public int computeSumOfSquaresTo(final int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * i);
        }
        return sum;
    }

    public int computeDifferenceOfSquares(final int n) {
        return computeSquareOfSumTo(n) - computeSumOfSquaresTo(n);
    }
}