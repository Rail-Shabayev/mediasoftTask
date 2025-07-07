import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberSupplier {
    public static void run() {
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(11); // [0;10]
        System.out.println("Случайное число: " + randomSupplier.get());
    }
}