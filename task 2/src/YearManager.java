import java.util.Random;

public class YearManager {
    private int[] carYears;
    private final int SIZE = 50;
    private final int CURRENT_YEAR = 2025;
    public YearManager() {
        carYears = new int[SIZE];
        generateYears();
    }
    //Заполняем массив случайными годами от 2000 до 2025
    private void generateYears() {
        Random random = new Random();
        for (int i = 0; i < carYears.length; i++) {
            carYears[i] = 2000 + random.nextInt(26); // 2000...2025
        }
    }
    //Выводим все годы
    public void printAllYears() {
        System.out.println("Все годы выпуска машин:");
        for (int year : carYears) {
            System.out.print(year + " ");
        }
        System.out.println();
    }
    //Выводим машины после 2015 года
    public void printAfter2015() {
        System.out.println("\nМашины, выпущенные после 2015 года:");
        for (int year : carYears) {
            if (year > 2015) {
                System.out.print(year + " ");
            }
        }
        System.out.println();
    }

    //Считаем средний возраст
    public double calculateAverageAge() {
        int totalAge = 0;
        for (int year : carYears) {
            totalAge += (CURRENT_YEAR - year);
        }
        return (double) totalAge / carYears.length;
    }

    //Выводим результат
    public void printAverageAge() {
        double averageAge = calculateAverageAge();
        System.out.printf("\nСредний возраст машин: %.2f лет\n", averageAge);
    }
}