import java.util.*;
import java.util.stream.Collectors;

public class CarParkAnalyzer {

    private List<Car> cars;

    public CarParkAnalyzer() {
        cars = new ArrayList<>();
    }

    // Добавляем тестовые данные
    public void addSampleCars() {
        cars.add(new Car("VIN1", "Camry", "Toyota", 2020, 30000, 25000));
        cars.add(new Car("VIN2", "Model S", "Tesla", 2022, 15000, 90000));
        cars.add(new Car("VIN3", "X5", "BMW", 2018, 60000, 45000));
        cars.add(new Car("VIN4", "Civic", "Honda", 2021, 40000, 22000));
        cars.add(new Car("VIN5", "Model 3", "Tesla", 2021, 20000, 40000));
        cars.add(new Car("VIN6", "Accord", "Honda", 2019, 70000, 18000));
    }

    // Фильтрация: пробег меньше maxMileage
    public List<Car> filterByMileage(int maxMileage) {
        return cars.stream()
                .filter(car -> car.getMileage() < maxMileage)
                .collect(Collectors.toList());
    }

    // Сортировка по цене (по убыванию)
    public List<Car> sortByPriceDescending() {
        return cars.stream()
                .sorted((c1, c2) -> Double.compare(c2.getPrice(), c1.getPrice()))
                .collect(Collectors.toList());
    }

    // Топ-N самых дорогих машин
    public List<Car> getTopNMostExpensive(int n) {
        return cars.stream()
                .sorted((c1, c2) -> Double.compare(c2.getPrice(), c1.getPrice()))
                .limit(n)
                .collect(Collectors.toList());
    }

    // Средний пробег всех машин
    public double calculateAverageMileage() {
        return cars.stream()
                .mapToInt(Car::getMileage)
                .average()
                .orElse(0);
    }

    // Группировка по производителю
    public Map<String, List<Car>> groupByManufacturer() {
        return cars.stream()
                .collect(Collectors.groupingBy(Car::getManufacturer));
    }

    // Вывод списка на экран
    public void printCars(List<Car> list, String title) {
        System.out.println("\n" + title + ":");
        for (Car car : list) {
            System.out.println("- " + car.getModel() + " (" + car.getYear() + ") — $" + car.getPrice() + ", пробег: " + car.getMileage() + " км");
        }
    }

    // Вывод группированного списка
    public void printGroupedByManufacturer(Map<String, List<Car>> grouped) {
        System.out.println("\nГруппировка по производителю:");
        for (Map.Entry<String, List<Car>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue().size() + " шт.):");
            for (Car car : entry.getValue()) {
                System.out.println("  - " + car.getModel() + " (" + car.getYear() + ") — $" + car.getPrice());
            }
        }
    }
}