import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.joining;

public class RnaTranscription {

    private static final Map<Character, String> COMPLEMENTS = new HashMap<Character, String>() {{
        put('G', "C");
        put('C', "G");
        put('T', "A");
        put('A', "U");
    }};

    public String ofDna(final String dnaString) {
        return dnaString.isEmpty() ? "" : dnaString.chars().mapToObj(i -> (char) i).map(COMPLEMENTS::get).collect(joining());
    }
}
