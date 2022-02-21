package oddNumber;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        do {
            System.out.print("Please enter the number: ");
            number = scanner.nextInt();
            if (number % 4 == 0) {
                sum += number;
            }
        } while (number % 2 == 0);
        System.out.println(sum);
        scanner.close();
    }
}
