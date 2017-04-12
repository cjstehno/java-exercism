import java.util.Arrays;

import static java.lang.Character.isLetter;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toUpperCase;

public class Acronym {

    private final String acronym;

    Acronym(final String phrase) {
        final StringBuffer str = new StringBuffer();

        final String[] words = phrase.split(" |-");

        for (final String word : words) {
            if (isAllCaps(word)) {
                str.append(word.charAt(0));

            } else {
                str.append(toUpperCase(word.charAt(0)));

                for (int ch = 1; ch < word.length(); ch++) {
                    if (isUpperCase(word.charAt(ch)) || word.charAt(ch - 1) == '-') {
                        str.append(toUpperCase(word.charAt(ch)));
                    }
                }
            }
        }

        this.acronym = str.toString();
    }

    String get() {
        return acronym;
    }

    private static boolean isAllCaps(final String str) {
        return str.chars().filter(value -> isLetter((char) value)).allMatch(value -> isUpperCase((char) value));
    }
}
