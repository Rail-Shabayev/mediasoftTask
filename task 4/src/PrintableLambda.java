@FunctionalInterface
interface Printable {
    void print();
}

public class PrintableLambda {
    public static void run() {
        Printable printable = () -> System.out.println("Привет из print()");
        printable.print();
    }
}