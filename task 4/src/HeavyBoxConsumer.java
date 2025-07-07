import java.util.function.Consumer;

class HeavyBox {
    int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }
}

public class HeavyBoxConsumer {
    public static void run() {
        Consumer<HeavyBox> consumer1 = box -> System.out.println("Отгрузили ящик с весом " + box.weight);
        Consumer<HeavyBox> consumer2 = box -> System.out.println("Отправляем ящик с весом " + box.weight);

        Consumer<HeavyBox> combined = consumer1.andThen(consumer2);
        combined.accept(new HeavyBox(20));
    }
}