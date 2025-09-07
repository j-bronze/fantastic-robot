import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//task1
        Scanner scanner = new Scanner(System.in);
//        String startMessage = "Please enter a value from 0 to 100:";
//        String warningMessage = "Incorrect value entered. ";
//
//        System.out.println(startMessage);
//        int userInput = scanner.nextInt();
//
//        if (userInput < 0 || userInput > 100) {
//            do {
//                System.out.println(warningMessage);
//                System.out.println(startMessage);
//                userInput = scanner.nextInt();
//            } while (!(userInput >= 0 && userInput <= 100));
//        }
//        if (userInput >= 90) {
//            System.out.println("Your grade is A!");
//        } else if (userInput >= 80) {
//            System.out.println("Your grade is B!");
//        } else if (userInput >= 70) {
//            System.out.println("Your grade is C!");
//        } else if (userInput >= 60) {
//            System.out.println("Your grade is D!");
//        } else if (userInput >= 50) {
//            System.out.println("Your grade is E!");
//        } else {
//            System.out.println("Your grade is F!");
//        }

//task2
//        String userValue = "";
//        //Scanner scanner = new Scanner(System.in);
//
//        while (!(userValue.equalsIgnoreCase("Exit"))){
//            System.out.print("Please enter something: ");
//            userValue = scanner.nextLine();
//        }
//        System.out.println("You're entered: " + userValue);


//task3
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i<= x; i++){
            sum += i;
        }
        System.out.printf("THe sum of all numbers from 0 to %d is %d", x, sum);



    }
}
