import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(final int number) {
        final List<Signal> signals = new LinkedList<>();

        String binary = Integer.toBinaryString(number);

        if (binary.length() > 0 && binary.charAt(binary.length() - 1) == '1') {
            signals.add(Signal.WINK);
        }

        if (binary.length() > 1 && binary.charAt(binary.length() - 2) == '1') {
            signals.add(Signal.DOUBLE_BLINK);
        }

        if (binary.length() > 2 && binary.charAt(binary.length() - 3) == '1') {
            signals.add(Signal.CLOSE_YOUR_EYES);
        }

        if (binary.length() > 3 && binary.charAt(binary.length() - 4) == '1') {
            signals.add(Signal.JUMP);
        }

        if (binary.length() > 4 && binary.charAt(binary.length() - 5) == '1') {
            Collections.reverse(signals);
        }

        return signals;
    }
}
