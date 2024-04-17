class Apartment extends Base implements Comparable<Apartment> {
    private Integer apartmentNumber;
    private Double area;
    private Integer floor;
    private Integer numberOfRooms;
    private String street;

    public Apartment() {
        super();
    }

    public Apartment(Integer id, Integer apartmentNumber, Double area, Integer floor, Integer numberOfRooms, String street) {
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
    }

    public Apartment(Integer apartmentNumber, Double area, Integer floor, Integer numberOfRooms, String street) {
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
    }

    public Apartment(Integer apartmentNumber, Double area, Integer floor, Integer numberOfRooms) {
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = "Невідома";
    }

    public Apartment(Apartment other) {
        this.apartmentNumber = other.apartmentNumber;
        this.area = other.area;
        this.floor = other.floor;
        this.numberOfRooms = other.numberOfRooms;
        this.street = other.street;
    }

    public Integer getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(Integer apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
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
        return "Квартира{" +
                "номер квартири=" + apartmentNumber +
                ", площа=" + area +
                ", поверх=" + floor +
                ", кількість кімнат=" + numberOfRooms +
                ", вулиця='" + street + '\'' +
                '}';
    }

    @Override
    public int compareTo(Apartment other) {
        return this.apartmentNumber.compareTo(other.apartmentNumber);
    }
}