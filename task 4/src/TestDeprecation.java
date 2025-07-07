@DeprecatedEx(message = "Используйте новый класс ModernClass")
class LegacyClass {
    @DeprecatedEx(message = "Используйте newMethod()")
    public void oldMethod() {
        System.out.println("Вызов старого метода");
    }

    public void newMethod() {
        System.out.println("Новый метод");
    }
}

public class TestDeprecation {}