class HotelRoom extends Base implements Comparable<HotelRoom> {
    private Integer roomNumber;
    private Integer floor;
    private Integer numberOfRooms;
    private String street;

    public HotelRoom() {
        super();
    }

    public HotelRoom(Integer roomNumber, Integer floor, Integer numberOfRooms, String street) {
        super();
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
    }

    public HotelRoom(HotelRoom other) {
        super();
        this.roomNumber = other.roomNumber;
        this.floor = other.floor;
        this.numberOfRooms = other.numberOfRooms;
        this.street = other.street;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "Номер кімнати=" + roomNumber +
                ", поверх=" + floor +
                ", кількість кімнат=" + numberOfRooms +
                ", вулиця='" + street + '\'' +
                '}';
    }

    @Override
    public int compareTo(HotelRoom other) {
        return this.roomNumber.compareTo(other.roomNumber);
    }
}