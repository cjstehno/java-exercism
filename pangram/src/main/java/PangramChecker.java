import static java.lang.String.valueOf;

public class PangramChecker {

    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public boolean isPangram(final String input) {
        return LETTERS.chars().mapToObj(i -> valueOf((char) i)).allMatch(input.toUpperCase()::contains);
    }
}
