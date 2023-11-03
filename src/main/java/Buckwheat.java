import java.util.Scanner;

public class Buckwheat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество месяцев, на которое Василий хочет питаться гречкой: ");

        int months = scanner.nextInt();
        int remaining = 100;
        int totalCost = 0;

        for (int i = 0; i < months; i++) {
            totalCost += remaining * 100;

            remaining -= 6;

            if (remaining <= 0) {
            }
        }
        System.out.println("Общая стоимость хранения гречки: " + totalCost + " рублей");
    }
}