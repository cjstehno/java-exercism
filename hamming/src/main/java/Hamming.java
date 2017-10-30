public class Hamming {

    private final int distance;

    public Hamming(final String strandA, final String strandB) {
        if (strandA.length() != strandB.length()) throw new IllegalArgumentException();

        int diff = 0;

        for (int i = 0; i < strandA.length(); i++) {
            if (strandA.charAt(i) != strandB.charAt(i)) {
                diff++;
            }
        }

        distance = diff;
    }

    public int getHammingDistance() {
        return distance;
    }
}


