import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HotelRoom[] hotelRooms = new HotelRoom[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < hotelRooms.length; i++) {
            System.out.print("Введіть номер кімнати:");
            int roomNumber = scanner.nextInt();

            System.out.print("Введіть поверх:");
            int floor = scanner.nextInt();

            System.out.print("Введіть кількість кімнат:");
            int numberOfRooms = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Введіть вулицю:");
            String street = scanner.nextLine();

            hotelRooms[i] = new HotelRoom(roomNumber, floor, numberOfRooms, street);
        }

        for (HotelRoom room : hotelRooms) {
            System.out.println(room);
        }
    }
}
