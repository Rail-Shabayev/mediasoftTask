public class Main {
    public static void main(String[] args) {

        System.out.println(" 1. Лямбда для Printable");
        PrintableLambda.run();

        System.out.println("\n 2. Проверка строки на null и пустую строку");
        StringValidation.run();

        System.out.println("\n 3. Проверка начала и конца строки");
        CustomStringCheck.run();

        System.out.println("\n 4. Работа с Consumer и HeavyBox");
        HeavyBoxConsumer.run();

        System.out.println("\n 5. Классификация числа");
        NumberClassifier.run();

        System.out.println("\n 6. Получение случайного числа");
        RandomNumberSupplier.run();

        System.out.println(" 7. Кастомная аннотация @DeprecatedEx и рефлексия");
        DeprecationHandler.checkDeprecation(LegacyClass.class);
    }
}