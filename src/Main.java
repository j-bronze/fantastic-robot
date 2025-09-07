import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String startMessage = "Please enter a number from 0 to 100:";
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
        if(userInput>=90) {
            System.out.println("Your grade is A!");
        } else if(userInput>=80) {
            System.out.println("Your grade is B!");
        } else if(userInput>=70) {
            System.out.println("Your grade is C!");
        } else if(userInput>=60) {
            System.out.println("Your grade is D!");
        } else if(userInput>=50) {
            System.out.println("Your grade is E!");
        } else {
            System.out.println("Your grade is F!");
        }







    }
}
