import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
        } else {
            for (int i =  2; i <= Math.sqrt(number);
            i++) {
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " является простым числом");
        } else {
            System.out.println(number + " не является простым числом");
        }
    }
}