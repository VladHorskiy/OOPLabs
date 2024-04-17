public class Apartment {
    private Integer id;
    private Integer apartmentNumber;
    private Double area;
    private Integer floor;
    private Integer numberOfRooms;
    private String street;

    public Apartment(Integer id, Integer apartmentNumber, Double area, Integer floor, Integer numberOfRooms, String street) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
                "id=" + id +
                ", номер квартири=" + apartmentNumber +
                ", площа=" + area +
                ", поверх=" + floor +
                ", кількість кімнат=" + numberOfRooms +
                ", вулиця='" + street + '\'' +
                '}';
    }
}