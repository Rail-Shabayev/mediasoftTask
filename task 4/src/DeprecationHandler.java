import java.lang.reflect.Method;

public class DeprecationHandler {

    public static void checkDeprecation(Class<?> clazz) {
        // Проверяем класс
        if (clazz.isAnnotationPresent(DeprecatedEx.class)) {
            DeprecatedEx annotation = clazz.getAnnotation(DeprecatedEx.class);
            System.out.println("Внимание: класс '" + clazz.getSimpleName() + "' устарел. Альтернатива: " + annotation.message());
        }

        // Проверяем методы
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(DeprecatedEx.class)) {
                DeprecatedEx annotation = method.getAnnotation(DeprecatedEx.class);
                System.out.println("Внимание: метод '" + method.getName() + "' устарел. Альтернатива: " + annotation.message());
            }
        }
    }
}