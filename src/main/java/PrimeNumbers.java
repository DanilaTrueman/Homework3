import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if (number == 1) {
            System.out.println(number + " не является ни простым, ни составным числом");
        } else if (isPrime) {
            System.out.println(number + " является простым числом");
        } else {
            System.out.println(number + " не является простым числом");
        }
    }
}