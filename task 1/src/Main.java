public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Иван");
        BankAccount account2 = new BankAccount("Петр");

        account1.deposit(1000);
        account1.withdraw(300);

        account1.transfer(account2, 200);
        account1.withdraw(1000);
        account1.setBlocked(true);

        account1.withdraw(100);
        account1.printInfo();
        account2.printInfo();
    }
}