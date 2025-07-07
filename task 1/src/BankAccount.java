import java.time.LocalDateTime;
public class BankAccount {
    String ownerName;
    int balance;
    boolean isBlocked;

    public BankAccount(String name) {
        this.ownerName = name;
        this.balance = 0;
        this.isBlocked = false;
    }

    public boolean deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: Сумма должна быть больше нуля");
            return false;
        }
        if (isBlocked) {
            System.out.println("Ошибка: Счет заблокирован");
            return false;
        }

        balance += amount;
        System.out.println("Пополнение: +" + amount);
        return true;
    }

    public boolean withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: Сумма должна быть больше нуля");
            return false;
        }
        if (isBlocked) {
            System.out.println("Ошибка: Счет заблокирован");
            return false;
        }
        if (balance < amount) {
            System.out.println("Ошибка: Недостаточно средств");
            return false;
        }

        balance -= amount;
        System.out.println("Снятие: -" + amount);
        return true;
    }

    public boolean transfer(BankAccount otherAccount, int amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: Сумма перевода должна быть больше нуля");
            return false;
        }
        if (isBlocked) {
            System.out.println("Ошибка: Счет заблокирован");
            return false;
        }
        if (otherAccount == null) {
            System.out.println("Ошибка: Целевой счет не найден");
            return false;
        }
        if (balance < amount) {
            System.out.println("Ошибка: Недостаточно средств для перевода");
            return false;
        }

        this.withdraw(amount);
        otherAccount.deposit(amount);
        System.out.println("Перевод выполнен: " + amount + " на счёт " + otherAccount.ownerName);
        return true;
    }

    public void setBlocked(boolean status) {
        isBlocked = status;
        System.out.println("Статус блокировки изменён: " + isBlocked);
    }

    public void printInfo() {
        System.out.println("\n--- Информация о счёте ---");
        System.out.println("Имя владельца: " + ownerName);
        System.out.println("Баланс: " + balance);
        System.out.println("Заблокирован: " + isBlocked);
    }
}