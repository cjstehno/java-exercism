public class HelloWorld {
    public static String hello(String name) {
        return "Hello, " + (name == null || name.length() == 0 ? "World" : name) + "!";
    }
}
