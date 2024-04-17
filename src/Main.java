import java.util.Locale;

public class Main {
    private static Apartment[] apartments = new Apartment[5];

    public static void main(String[] args) {
        fillApartments();
        printApartmentsByNumberOfRooms(2);
        printApartmentsByFloorAndRooms(2, 1, 5);
        printApartmentsByArea(70.0);
    }

    private static void fillApartments() {
        apartments[0] = new Apartment(1, 101, 60.5, 1, 2, "Слов'янська");
        apartments[1] = new Apartment(2, 202, 75.2, 2, 3, "Зелена");
        apartments[2] = new Apartment(3, 303, 80.0, 3, 2, "Шевченка");
        apartments[3] = new Apartment(4, 404, 90.3, 4, 4, "Привітна");
        apartments[4] = new Apartment(5, 505, 55.8, 5, 1, "Сонячна");
    }

    private static void printApartmentsByNumberOfRooms(Integer numberOfRooms) {
        System.out.println("Квартири з " + numberOfRooms + " кімнатами:");
        for (Apartment apartment : apartments) {
            if (apartment.getNumberOfRooms().equals(numberOfRooms)) {
                System.out.println(apartment);
            }
        }
        System.out.println();
    }

    private static void printApartmentsByFloorAndRooms(Integer numberOfRooms, Integer minFloor, Integer maxFloor) {
        System.out.println("Квартири з " + numberOfRooms + " кімнатами на поверсі від " + minFloor + " до " + maxFloor + ":");
        for (Apartment apartment : apartments) {
            if (apartment.getNumberOfRooms().equals(numberOfRooms) && apartment.getFloor() >= minFloor && apartment.getFloor() <= maxFloor) {
                System.out.println(apartment);
            }
        }
        System.out.println();
    }

    private static void printApartmentsByArea(Double minArea) {
        System.out.println("Квартири з площею більше " + minArea + " м^2:");
        for (Apartment apartment : apartments) {
            if (apartment.getArea() > minArea) {
                System.out.println(apartment);
            }
        }
        System.out.println();
    }
}
