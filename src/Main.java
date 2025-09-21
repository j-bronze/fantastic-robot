import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            Scanner scanner = new Scanner(System.in);
            String padType;
            String cover;
            int density;
            int sheetsQuantity;

            System.out.println("Please input a type of pad: ");
            padType = scanner.nextLine();
            System.out.println("Is a pad cover flexible or hard? ");
            cover = scanner.nextLine();
            System.out.println("Please input a density: ");
            density = scanner.nextInt();
            System.out.println("Please input a quantity of sheets: ");
            sheetsQuantity = scanner.nextInt();

            FileWriter writer = new FileWriter("D:\\trainingAQA\\fantastic-robot\\src\\userPads.txt", true);
            writer.write(padType + "\n");
            writer.close();
            writer = new FileWriter("D:\\trainingAQA\\fantastic-robot\\src\\userPads.txt", true);
            writer.write(cover + "\n");
            writer.close();
            writer = new FileWriter("D:\\trainingAQA\\fantastic-robot\\src\\userPads.txt", true);
            writer.write(density + "\n");
            writer.close();
            writer = new FileWriter("D:\\trainingAQA\\fantastic-robot\\src\\userPads.txt", true);
            writer.write(sheetsQuantity + "\n\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Filing error: " + e.getMessage());
        }

        System.out.println("\nEND OF FILING");

        File file = new File("D:\\trainingAQA\\fantastic-robot\\src\\userPads.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> padFromFile = new ArrayList<>();

        while (scanner.hasNext()) {
            padFromFile.add(scanner.nextLine());
        }
        padFromFile.forEach(System.out::println);

    }
}
