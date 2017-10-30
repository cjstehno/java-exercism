import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import static java.util.Collections.reverse;

class HandshakeCalculator {

    List<Signal> calculateHandshake(final int number) {
        final List<Signal> signals = new LinkedList<>();

        final String input = Integer.toBinaryString(number);

        onInput(input, 1, op -> signals.add(Signal.WINK));
        onInput(input, 2, op -> signals.add(Signal.DOUBLE_BLINK));
        onInput(input, 3, op -> signals.add(Signal.CLOSE_YOUR_EYES));
        onInput(input, 4, op -> signals.add(Signal.JUMP));
        onInput(input, 5, op -> reverse(signals));

        return signals;
    }

    private static void onInput(final String input, final int offset, final Consumer<Void> consumer) {
        if (input.length() > (offset - 1) && input.charAt(input.length() - offset) == '1') {
            consumer.accept(null);
        }
    }
}
