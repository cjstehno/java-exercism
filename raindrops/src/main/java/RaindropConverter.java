class RaindropConverter {

    String convert(final int number) {
        final StringBuilder str = new StringBuilder();

        if (number % 3 == 0) {
            str.append("Pling");
        }

        if (number % 5 == 0) {
            str.append("Plang");
        }

        if (number % 7 == 0) {
            str.append("Plong");
        }

        if (str.length() == 0) {
            str.append(String.valueOf(number));
        }

        return str.toString();
    }
}
