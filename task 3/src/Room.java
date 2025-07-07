public abstract class Room {
    private int roomNumber;
    private int maxOccupancy;
    private int pricePerNight;
    private boolean isReserved;

    // Конструктор с полной инициализацией
    public Room(int roomNumber, int maxOccupancy, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.maxOccupancy = maxOccupancy;
        this.pricePerNight = pricePerNight;
        this.isReserved = false;
    }

    // Геттеры и сеттеры
    public int getRoomNumber() {
        return roomNumber;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        this.isReserved = reserved;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", maxOccupancy=" + maxOccupancy +
                ", pricePerNight=" + pricePerNight +
                ", isReserved=" + isReserved +
                '}';
    }
}