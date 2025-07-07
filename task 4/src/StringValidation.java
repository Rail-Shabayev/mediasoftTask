import java.util.function.Predicate;

public class StringValidation {
    public static void run() {
        Predicate<String> isNotNull = s -> s != null;
        Predicate<String> isNotEmpty = s -> s != null && !s.isEmpty();
        Predicate<String> isValid = isNotNull.and(isNotEmpty);

        String testStr = "Java";

        System.out.println("Строка не null: " + isNotNull.test(testStr));
        System.out.println("Строка не пустая: " + isNotEmpty.test(testStr));
        System.out.println("Строка не null и не пустая: " + isValid.test(testStr));
    }
}