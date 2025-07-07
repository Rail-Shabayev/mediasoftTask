import java.util.function.Function;

public class NumberClassifier {
    public static void run() {
        Function<Integer, String> classify = num -> {
            if (num > 0) return "Положительное число";
            else if (num < 0) return "Отрицательное число";
            else return "Ноль";
        };

        System.out.println("Число -5: " + classify.apply(-5));
        System.out.println("Число 0: " + classify.apply(0));
        System.out.println("Число 7: " + classify.apply(7));
    }
}