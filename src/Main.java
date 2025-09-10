import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    //task1
        String startMessage = "Please enter a value from 0 to 100:";
        String warningMessage = "Incorrect value entered. ";

        System.out.println(startMessage);
        int userInput = scanner.nextInt();

        if (userInput < 0 || userInput > 100) {
            do {
                System.out.println(warningMessage);
                System.out.println(startMessage);
                userInput = scanner.nextInt();
            } while (!(userInput >= 0 && userInput <= 100));
        }
        if (userInput >= 90) {
            System.out.println("Your grade is A!");
        } else if (userInput >= 80) {
            System.out.println("Your grade is B!");
        } else if (userInput >= 70) {
            System.out.println("Your grade is C!");
        } else if (userInput >= 60) {
            System.out.println("Your grade is D!");
        } else if (userInput >= 50) {
            System.out.println("Your grade is E!");
        } else {
            System.out.println("Your grade is F!");
        }


    //task2
        String userValue = "";
        userValue = scanner.nextLine();
        while (!(userValue.equalsIgnoreCase("Exit"))) {
            System.out.print("\nPlease enter something: ");
            userValue = scanner.nextLine();
        }
        System.out.println("You're entered: " + userValue);


    //task3
        System.out.println("\nPlease enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;

        if (x > 0) {
            for (int i = 0; i <= x; i++) {
                sum += i;
            }
        } else {
            for (int i = 0; i >= x; i--) {
                sum += i;
            }
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d\n\n", x, sum);


    //task4
        System.out.println(
                "Choose a channel:\n1 - Discovery\n2 - National Geographic\n3 - Euronews\n4 - Eurosport\n0 - input to EXIT.\nPlease enter a number: ");
        int userInputChannel = scanner.nextInt();
        String[] Channels = {"", "Discovery", "National Geographic", "Euronews", "Eurosport"};

        while (userInputChannel != 0) {
            while (userInputChannel <= Channels.length && userInputChannel > 0) {
                System.out.println("Your choice is: " + Channels[userInputChannel] + "\nPlease choose one more: ");
                userInputChannel = scanner.nextInt();
            }
            while (userInputChannel > Channels.length || userInputChannel < 0) {
                System.out.println("Unknown channel! Choose another one: ");
                userInputChannel = scanner.nextInt();
            }
        }


    }
}
