import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class RaindropConverter {

    String convert(final int number) {
        final List<String> parts = new LinkedList<>();

        if (number % 3 == 0) {
            parts.add("Pling");
        }

        if (number % 5 == 0) {
            parts.add("Plang");
        }

        if (number % 7 == 0) {
            parts.add("Plong");
        }

        if( parts.isEmpty() ){
            parts.add(String.valueOf(number));
        }

        return parts.stream().collect(Collectors.joining(""));
    }
}
