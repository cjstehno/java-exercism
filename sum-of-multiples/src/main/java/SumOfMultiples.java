import java.util.HashSet;
import java.util.Set;

class SumOfMultiples {

    private final int sum;

    SumOfMultiples(int number, int[] set) {
        final Set<Integer> items = new HashSet<>();

        for (int n = 1; n < number; n++) {
            for (int m : set) {
                if (n % m == 0) {
                    items.add(n);
                }
            }
        }

        this.sum = items.stream().reduce(0, (result, item) -> result + item);
    }

    int getSum() {
        return sum;
    }
}
