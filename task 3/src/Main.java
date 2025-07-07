public class Main {
    public static void main(String[] args) {
        EconomyRoom economyRoom = new EconomyRoom(101, 2, 100);

        RoomService<Room> service = new RoomServiceImpl();

        // Успешное бронирование
        service.reserve(economyRoom); // Выведет: Комната 101 успешно забронирована.

        try {
            service.reserve(economyRoom); // Вызовет исключение
        } catch (RoomAlreadyReservedException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        service.free(economyRoom); // Освободить комнату
        service.clean(economyRoom); // Почистить комнату

        System.out.println(economyRoom); // Покажет текущее состояние
    }
}