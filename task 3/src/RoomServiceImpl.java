public class RoomServiceImpl implements RoomService<Room> {
    @Override
    public void clean(Room room) {
        System.out.println("Комната " + room.getRoomNumber() + " очищается.");
    }

    @Override
    public void reserve(Room room) {
        if (room.isReserved()) {
            throw new RoomAlreadyReservedException("Невозможно забронировать: комната " + room.getRoomNumber() + " уже занята.");
        }
        room.setReserved(true);
        System.out.println("Комната " + room.getRoomNumber() + " успешно забронирована.");
    }

    @Override
    public void free(Room room) {
        room.setReserved(false);
        System.out.println("Комната " + room.getRoomNumber() + " освобождена.");
    }
}