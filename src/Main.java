import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        HotelRoom[] hotelRooms = new HotelRoom[10];
        hotelRooms[0] = new HotelRoom(101, 1, 1, "Центральна");
        hotelRooms[1] = new HotelRoom(102, 1, 1, "Головна");
        hotelRooms[2] = new HotelRoom(103, 2, 2, "Соборна");
        hotelRooms[3] = new HotelRoom(104, 2, 2, "Лісна");
        hotelRooms[4] = new HotelRoom(105, 3, 1, "Паркова");
        hotelRooms[5] = new HotelRoom(106, 3, 1, "Садова");
        hotelRooms[6] = new HotelRoom(107, 4, 2, "Проспект Миру");
        hotelRooms[7] = new HotelRoom(108, 4, 2, "Сонячна");
        hotelRooms[8] = new HotelRoom(109, 5, 3, "Вишнева");
        hotelRooms[9] = new HotelRoom(110, 5, 3, "Зелена");

        Apartment[] apartments = new Apartment[10];
        apartments[0] = new Apartment(1, 1001, 75.5, 10, 3, "Березова");
        apartments[1] = new Apartment(2, 1002, 80.0, 11, 4, "Дубова");
        apartments[2] = new Apartment(3, 1003, 85.0, 12, 3, "Соснова");
        apartments[3] = new Apartment(4, 1004, 90.5, 13, 4, "Липова");
        apartments[4] = new Apartment(5, 1005, 95.0, 14, 2, "Ясенева");
        apartments[5] = new Apartment(6, 1006, 100.0, 15, 3, "Кленова");
        apartments[6] = new Apartment(7, 1007, 105.5, 16, 2, "Поліська");
        apartments[7] = new Apartment(8, 1008, 110.0, 17, 4, "Вишнякова");
        apartments[8] = new Apartment(9, 1009, 115.0, 18, 3, "Садова");
        apartments[9] = new Apartment(10, 1010, 120.0, 19, 4, "Лісова");

         Arrays.sort(hotelRooms, new Comparator<HotelRoom>() {
            @Override
            public int compare(HotelRoom room1, HotelRoom room2) {
                int result = room1.getStreet().compareTo(room2.getStreet());
                if (result == 0) {
                    result = room1.getNumberOfRooms().compareTo(room2.getNumberOfRooms());
                }
                return result;
            }
        });

        Arrays.sort(apartments, new Comparator<Apartment>() {
            @Override
            public int compare(Apartment apartment1, Apartment apartment2) {
                int result = apartment1.getNumberOfRooms().compareTo(apartment2.getNumberOfRooms());
                if (result == 0) {
                    result = apartment1.getStreet().compareTo(apartment2.getStreet());
                }
                return result;
            }
        });

        System.out.println("Відсортовані номери готелю:");
        for (HotelRoom room : hotelRooms) {
            System.out.println(room);
        }

        System.out.println("\nВідсортовані квартири:");
        for (Apartment apartment : apartments) {
            System.out.println(apartment);
        }
    }
}
