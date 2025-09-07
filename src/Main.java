import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String myName = "Yauheniya";
        String mySurname = "Baraznouskaya";
        String myProfession = "QA Engineer";
        int yearsOfExperience = 5;
        String message = String.format("My name is %s %s. I'm a %s with %d years of experience.",
                myName, mySurname, myProfession, yearsOfExperience);

        System.out.println(message);
        System.out.println("\nNumber of letters in the message is " + message.length());
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        String enteredName = scanner.nextLine();

        boolean enteredStringIsEmpty = enteredName.isEmpty();
        System.out.println("Is entered string empty? - " + enteredStringIsEmpty);

        char singleCharFromString = enteredName.charAt(2);
        System.out.println("The third char in the entered string is \'" + singleCharFromString + "\'");

        boolean stringsAreEqual = myName.equals(enteredName);
        System.out.println("Are two names equal? - " + stringsAreEqual);

        boolean stringsAreEqualCaseInsensitive = myName.equalsIgnoreCase(enteredName);
        System.out.println("Are two names equal in case insensitive? - " + stringsAreEqualCaseInsensitive);

        boolean startsWithYa = enteredName.startsWith("Ya");
        System.out.println("Does name start with \'Ya\'? - " + startsWithYa);
        boolean endsWithYa = enteredName.endsWith("ya");
        System.out.println("Does name end with \'ya\'? - " + endsWithYa);
        boolean containsGo = enteredName.contains("B");
        System.out.println("Does name contain \'go\'? - " + containsGo);

        String updatedMessage = message.replace('n', 'N');
        System.out.println("Updated message: " + updatedMessage);

        String lowerCaseString = updatedMessage.toLowerCase();
        System.out.println("To lower case: " + lowerCaseString);
    }
}