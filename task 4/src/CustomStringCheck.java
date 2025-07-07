import java.util.function.Predicate;

public class CustomStringCheck {
    public static void run() {
        Predicate<String> checkString = s ->
                (s.startsWith("J") || s.startsWith("N")) && s.endsWith("A");

        String testStr = "Java";
        System.out.println("Проверяем строку \"" + testStr + "\": " + checkString.test(testStr));
    }
}