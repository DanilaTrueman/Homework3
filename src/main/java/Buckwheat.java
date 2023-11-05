import java.util.Scanner;

public class Buckwheat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pricePerKilogram = 100;

        System.out.print("Введите количество месяцев для питания гречкой: ");

        int months = scanner.nextInt();

        int totalCost = 0;

        for (int i = 0; i < months; i++) {
            int remainingQuantity = (months - i) * 6;
            int monthlyCost = remainingQuantity * pricePerKilogram;
            totalCost += monthlyCost;
        }

        System.out.println("Общая стоимость хранения гречки: " + totalCost + " рублей");
    }
}