import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 0 to 100: ");
        int userInput = scanner.nextInt();

        if (userInput < 0 || userInput > 100) {
            do {
                System.out.println("Incorrect value entered. ");
                System.out.println("Please enter a number from 0 to 100: ");
                userInput = scanner.nextInt();
            } while (!(userInput >= 0 && userInput <= 100));
        } else {
            System.out.println("Bingo!");
        }


    }
}
