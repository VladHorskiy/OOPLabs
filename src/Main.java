import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static double calculateR(double a, double b, double t) {
        return Math.exp(-b * t) * Math.sin(a * t + b) - Math.sqrt(Math.abs(b * t + a));
    }

    public static double calculateS(double a, double b, double t) {
        return b * Math.sin(a * Math.pow(t, 2) * Math.cos(2 * t)) - 1;
    }

    public static void print(double r, double s) {
        System.out.println("Результат обчислення R: " + r);
        System.out.println("Результат обчислення S: " + s);
    }

    public static void printDateTime() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Поточна дата: " + formattedDate);
    }

    public static void inputValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть значення a:");
        double a = scanner.nextDouble();
        System.out.println("Введіть значення b:");
        double b = scanner.nextDouble();
        System.out.println("Введіть значення t:");
        double t = scanner.nextDouble();

        double r = calculateR(a, b, t);
        double s = calculateS(a, b, t);

        print(r, s);
    }

    public static void run() {
        inputValues();
        printDateTime();
    }

    public static void main(String[] args) {
        run();
    }
}
