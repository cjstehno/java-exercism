import static java.lang.Character.*;
import static java.lang.String.valueOf;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class Acronym {

    private final String acronym;

    public Acronym(final String phrase) {
        final String[] words = phrase.split("[ -]");

        this.acronym = stream(words)
            .map(word -> isAllCaps(word) ? valueOf(word.charAt(0)) : acronymizeWord(word))
            .collect(joining());
    }

    private static String acronymizeWord(final String word) {
        final StringBuffer str = new StringBuffer(valueOf(toUpperCase(word.charAt(0))));

        for (int ch = 1; ch < word.length(); ch++) {
            if (isUpperCase(word.charAt(ch)) || word.charAt(ch - 1) == '-') {
                str.append(toUpperCase(word.charAt(ch)));
            }
        }

        return str.toString();
    }

    String get() {
        return acronym;
    }

    private static boolean isAllCaps(final String str) {
        return str.chars().filter(value -> isLetter((char) value)).allMatch(value -> isUpperCase((char) value));
    }
}
