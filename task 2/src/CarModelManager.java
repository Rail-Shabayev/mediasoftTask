import java.util.*;

public class CarModelManager {

    private List<String> models;

    public CarModelManager() {
        this.models = new ArrayList<>();
    }

    // Метод для получения списка моделей
    public List<String> getModels() {
        return new ArrayList<>(models);
    }

    // Добавляем тестовые модели
    public void addSampleModels() {
        models.add("Toyota Camry");
        models.add("BMW X5");
        models.add("Tesla Model S");
        models.add("Honda Civic");
        models.add("Tesla Roadster");
        models.add("BMW X5");
        models.add("Tesla Model S");
    }

    // Получаем уникальные модели через Set
    public Set<String> getUniqueModels() {
        return new HashSet<>(models);
    }

    //Сортируем уникальные модели в обратном алфавитном порядке
    public List<String> getSortedUniqueModels() {
        List<String> uniqueList = new ArrayList<>(getUniqueModels());
        Collections.sort(uniqueList, Collections.reverseOrder());
        return uniqueList;
    }

    //Замена всех Tesla на ELECTRO_CAR
    public List<String> replaceTeslaWithElectro(List<String> list) {
        List<String> result = new ArrayList<>(list);
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).contains("Tesla")) {
                result.set(i, "ELECTRO_CAR");
            }
        }
        return result;
    }

    //Метод для вывода списка на экран
    public void printList(List<String> list, String title) {
        System.out.println("\n" + title + ":");
        for (String item : list) {
            System.out.println("- " + item);
        }
    }
}