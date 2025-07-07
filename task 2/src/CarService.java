import java.util.HashSet;

public class CarService {

    public void testCarSet() {
        HashSet<Car> carSet = new HashSet<>();

        // Добавляем машины
        carSet.add(new Car("VIN123", "Camry", "Toyota", 2020, 30000, 25000));
        carSet.add(new Car("VIN456", "Model S", "Tesla", 2022, 15000, 90000));
        carSet.add(new Car("VIN123", "Camry", "Toyota", 2020, 30000, 25000)); // дубликат по VIN

        // Выводим результат
        System.out.println("\nМашины в HashSet (дубликаты не добавились):");
        for (Car car : carSet) {
            System.out.println(car);
        }
    }
}