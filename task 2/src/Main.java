import java.util.List;
import java.util.Set;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        // --- Пункт 1: Работа с годами ---
        YearManager yearManager = new YearManager();

        yearManager.printAllYears();
        yearManager.printAfter2015();
        yearManager.printAverageAge();


        // --- Пункт 2: Работа с моделями ---
        CarModelManager modelManager = new CarModelManager();
        modelManager.addSampleModels();

        modelManager.printList(modelManager.getModels(), "Исходные модели (с дубликатами)");

        Set<String> uniqueSet = modelManager.getUniqueModels();
        System.out.println("\nУникальные модели сохранены в Set");

        List<String> sortedList = modelManager.getSortedUniqueModels();
        modelManager.printList(sortedList, "Уникальные модели (в обратном алфавитном порядке)");

        List<String> finalList = modelManager.replaceTeslaWithElectro(sortedList);
        modelManager.printList(finalList, "Обработанные модели (Tesla → ELECTRO_CAR)");


        // --- Пункт 3: equals / hashCode ---
        CarService carService = new CarService();
        carService.testCarSet();


        // --- Пункт 4: Stream API ---
        CarParkAnalyzer analyzer = new CarParkAnalyzer();
        analyzer.addSampleCars();

        // Фильтрация по пробегу
        List<Car> filtered = analyzer.filterByMileage(50000);
        analyzer.printCars(filtered, "Машины с пробегом < 50 000 км");

        // Сортировка по цене
        List<Car> sortedByPrice = analyzer.sortByPriceDescending();
        analyzer.printCars(sortedByPrice, "Машины по убыванию цены");

        // Топ-3 самых дорогих
        List<Car> top3 = analyzer.getTopNMostExpensive(3);
        analyzer.printCars(top3, "Топ-3 самых дорогих машин");

        // Средний пробег
        double avgMileage = analyzer.calculateAverageMileage();
        System.out.printf("\nСредний пробег всех машин: %.2f км\n", avgMileage);

        // Группировка по производителю
        Map<String, List<Car>> grouped = analyzer.groupByManufacturer();
        analyzer.printGroupedByManufacturer(grouped);
    }
}