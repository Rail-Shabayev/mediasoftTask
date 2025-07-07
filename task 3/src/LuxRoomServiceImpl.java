public class LuxRoomServiceImpl implements LuxRoomService<LuxRoom> {
    @Override
    public void clean(LuxRoom room) {
        System.out.println("Cleaning luxury room " + room.getRoomNumber());
    }

    @Override
    public void reserve(LuxRoom room) throws RoomAlreadyReservedException {
        if (room.isBooked()) {
            throw new RoomAlreadyReservedException("Luxury room " + room.getRoomNumber() + " is already booked.");
        }
        room.setBooked(true);
        System.out.println("Luxury room " + room.getRoomNumber() + " has been booked.");
    }

    @Override
    public void free(LuxRoom room) {
        room.setBooked(false);
        System.out.println("Luxury room " + room.getRoomNumber() + " has been freed.");
    }

    @Override
    public void foodDelivery(LuxRoom room) {
        System.out.println("Food delivery ordered for luxury room " + room.getRoomNumber());
    }
}