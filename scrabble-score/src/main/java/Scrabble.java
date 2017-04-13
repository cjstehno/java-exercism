import static java.lang.Character.toUpperCase;

public class Scrabble {

    private final int score;

    Scrabble(final String input) {
        score = (input != null ? input : "").chars().map(operand -> score((char) operand)).sum();
    }

    int getScore() {
        return score;
    }

    private static int score(final char letter) {
        switch (toUpperCase(letter)) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'L':
            case 'N':
            case 'R':
            case 'S':
            case 'T':
                return 1;
            case 'D':
            case 'G':
                return 2;
            case 'B':
            case 'C':
            case 'M':
            case 'P':
                return 3;
            case 'F':
            case 'H':
            case 'V':
            case 'W':
            case 'Y':
                return 4;
            case 'K':
                return 5;
            case 'J':
            case 'X':
                return 8;
            case 'Q':
            case 'Z':
                return 10;
            default:
                return 0;
        }
    }
}
