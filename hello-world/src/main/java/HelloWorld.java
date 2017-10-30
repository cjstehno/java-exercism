import static java.lang.String.format;

public class HelloWorld {
    public static String hello(String name) {
        return format("Hello, %s!", name == null || name.isEmpty() ? "World" : name);
    }
}
