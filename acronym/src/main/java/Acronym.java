import java.util.Arrays;
import java.util.stream.Collectors;

import static java.lang.Character.isLetter;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toUpperCase;
import static java.lang.String.valueOf;

public class Acronym {

    private final String acronym;

    Acronym(final String phrase) {
        final String[] words = phrase.split(" |-");

        this.acronym = Arrays.stream(words).map(word -> {
            if (isAllCaps(word)) {
                return valueOf(word.charAt(0));

            } else {
                final StringBuffer str = new StringBuffer(valueOf(toUpperCase(word.charAt(0))));

                for (int ch = 1; ch < word.length(); ch++) {
                    if (isUpperCase(word.charAt(ch)) || word.charAt(ch - 1) == '-') {
                        str.append(toUpperCase(word.charAt(ch)));
                    }
                }

                return str.toString();
            }
        }).collect(Collectors.joining());
    }

    String get() {
        return acronym;
    }

    private static boolean isAllCaps(final String str) {
        return str.chars().filter(value -> isLetter((char) value)).allMatch(value -> isUpperCase((char) value));
    }
}
